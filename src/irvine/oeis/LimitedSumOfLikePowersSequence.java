package irvine.oeis;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * Generate terms for a sequence of like powers.
 * @author Sean A. Irvine
 */
public class LimitedSumOfLikePowersSequence implements Sequence {

  // A version of SumOfLikePowerSequence that can target specific numbers
  // of representations.

  // We maintain a sorted map, mA, of terms yet to be output.   We also keep
  // track of the largest numbers so far considered as a base for the power,
  // mM.  That is, all terms involving sums up to and including (mN - 1)^p
  // are already accounted for (i.e., already output or in mA).
  // While the first item in mA is larger than mM^p, then we compute all
  // possible terms involving mM^p and add them into the map mA.
  // Depending on parameters we might sometimes compute beforehand more
  // terms than strictly necessary.
  // Finally we return (and remove) the first element from mA.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Z, MutableInteger> mA = new TreeMap<>();
  private final ArrayList<Z> mPowers = new ArrayList<>(); // for efficiency, caching powers
  private final int mPower;
  private final int mNumTerms;
  private final boolean mExactWays;
  private final int mMinWays;
  private final int mAdd;
  private int mM = 1;

  /**
   * Construct the sequence.
   * @param power the power to be used in each term
   * @param numTerms number of terms in the sum
   * @param minWays minimum numbers of ways to make the sum
   * @param exact number of ways must be exact
   * @param distinct whether all the terms are distinct
   */
  public LimitedSumOfLikePowersSequence(final int power, final int numTerms, final int minWays, final boolean exact, final boolean distinct) {
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
   * Construct the sequence of powers.
   * @param power the power to be used in each term
   * @param terms number of terms in the sum
   * @param minWays minimum number of ways to make the sum
   */
  protected LimitedSumOfLikePowersSequence(final int power, final int terms, final int minWays) {
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
      mPowers.add(Z.valueOf(mPowers.size()).pow(mPower));
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
          StringUtils.message("Search done to " + mM + "^" + mPower);
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
   * @param args power, terms, min ways, exact
   */
  public static void main(final String[] args) {
    final Sequence seq = new LimitedSumOfLikePowersSequence(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), args.length > 3, false);
    while (true) {
      System.out.println(seq.next());
    }
  }
}
