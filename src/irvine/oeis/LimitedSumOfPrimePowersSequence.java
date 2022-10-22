package irvine.oeis;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * Generate terms for a sequence of like powers.
 * @author Sean A. Irvine
 */
public class LimitedSumOfPrimePowersSequence extends Sequence1 {

  // Like LimitedSumOfLikePowersSequence but restricted to prime terms.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Z, MutableInteger> mA = new TreeMap<>();
  private final ArrayList<Z> mPowers = new ArrayList<>(); // for efficiency, caching powers
  private final Fast mPrime = new Fast();
  private final int mPower;
  private final int mNumTerms;
  private final boolean mExactWays;
  private final int mMinWays;
  private final int mAdd;
  private long mP = 2;
  private int mM = 1;

  /**
   * Construct the sequence.
   * @param power the power to be used in each term
   * @param numTerms number of terms in the sum
   * @param minWays minimum numbers of ways to make the sum
   * @param exact number of ways must be exact
   * @param distinct whether all the terms are distinct
   */
  public LimitedSumOfPrimePowersSequence(final int power, final int numTerms, final int minWays, final boolean exact, final boolean distinct) {
    mPower = power;
    mNumTerms = numTerms;
    mExactWays = exact;
    mMinWays = minWays;
    mAdd = distinct ? 1 : 0;
    if (mNumTerms == 0) {
      mA.put(Z.ZERO, new MutableInteger(1));
    }
  }

  /**
   * Construct the sequence. of powers.
   * @param power the power to be used in each term
   * @param terms number of terms in the sum
   * @param minWays minimum number of ways to make the sum
   */
  protected LimitedSumOfPrimePowersSequence(final int power, final int terms, final int minWays) {
    this(power, terms, minWays, false, false);
  }

  /**
   * Return <code>n^power</code> where <code>power</code> was specified at
   * construction.  Uses a cache of values to avoid recomputing.
   * @param n base
   * @return <code>n^power</code>
   */
  protected Z pow(final int n) {
    while (n >= mPowers.size()) {
      mPowers.add(Z.valueOf(mP).pow(mPower));
      mP = mPrime.nextPrime(mP);
    }
    return mPowers.get(n);
  }

  private void insertTerms(final Z sumSoFar, final int termsSoFar, final int prevBase) {
    if (termsSoFar == mNumTerms) {
      final MutableInteger ways = mA.get(sumSoFar);
      if (ways != null) {
        ways.postIncrement();
      } else {
        mA.put(sumSoFar, new MutableInteger(1));
      }
      return;
    }
    // Add one more term into the sum and recurse
    for (int k = prevBase + mAdd; k <= mM; ++k) {
      insertTerms(sumSoFar.add(pow(k)), termsSoFar + 1, k);
    }
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey().compareTo(pow(mM)) >= 0) {
        insertTerms(pow(mM), 1, 1);
        ++mM; // we finished adding all sums of powers up to mM^p
        if (mVerbose && mM % 10 == 0) {
          StringUtils.message("Search done to " + mP + "^" + mPower);
        }
      }
      final Map.Entry<Z, MutableInteger> e = mA.pollFirstEntry();
      final int ways = e.getValue().get();
      if (ways >= mMinWays && (!mExactWays || ways == mMinWays)) {
        return e.getKey();
      }
    }
  }

  /**
   * For testing.
   * @param args power, terms, min ways
   */
  public static void main(final String[] args) {
    final Sequence seq = new LimitedSumOfPrimePowersSequence(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), args.length > 3, false);
    while (true) {
      System.out.println(seq.next());
    }
  }
}
