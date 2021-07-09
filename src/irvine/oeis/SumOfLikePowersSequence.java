package irvine.oeis;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Generate terms for a sequence of like powers.
 * @author Sean A. Irvine
 */
public class SumOfLikePowersSequence implements Sequence {

  // We maintain a sorted set, mA, of terms yet to be output.   We also keep
  // track of the largest numbers so far considered as a base for the power,
  // mM.  That is, all terms involving sums up to and including (mN - 1)^p
  // are already accounted for (i.e., already output or in mA).
  // While the first item in mA is larger than mM^p, then we compute all
  // possible terms involving mM^p and add them into the set mA.
  // Depending on parameters we might sometimes compute beforehand more
  // terms than strictly necessary.
  // Finally we return (and remove) the first element from mA.

  private final TreeSet<Z> mA = new TreeSet<>();
  private final ArrayList<Z> mPowers = new ArrayList<>(); // for efficiency, caching powers
  private final int mPower;
  private final int mMinTerms;
  private final int mMaxTerms;
  private final int mAdd;
  private int mM = 1;

  /**
   * Construct the sequence.
   * @param power the power to be used in each term
   * @param minTerms minimum number of terms in the sum
   * @param maxTerms maximum number of terms in the sum
   * @param distinct whether all the terms are distinct
   */
  public SumOfLikePowersSequence(final int power, final int minTerms, final int maxTerms, final boolean distinct) {
    mPower = power;
    mMinTerms = minTerms;
    mMaxTerms = maxTerms;
    mAdd = distinct ? 1 : 0;
    if (mMinTerms == 0) {
      mA.add(Z.ZERO);
    }
  }

  /**
   * Construct the sequence. of powers.
   * @param power the power to be used in each term
   * @param terms number of terms in the sum
   */
  protected SumOfLikePowersSequence(final int power, final int terms) {
    this(power, terms, terms, false);
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
    if (termsSoFar >= mMinTerms) {
      mA.add(sumSoFar);
      if (termsSoFar >= mMaxTerms) {
        return; // no further contribution
      }
    }
    // Add one more term into the sum and recurse
    for (int k = prevBase + mAdd; k <= mM; ++k) {
      insertTerms(sumSoFar.add(pow(k)), termsSoFar + 1, k);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(pow(mM)) >= 0) {
      insertTerms(pow(mM), 1, 1);
      ++mM; // we finished adding all sums of powers up to mM^p
    }
    return mA.pollFirst();
  }

  /**
   * For testing.
   * @param args power, terms
   */
  public static void main(final String[] args) {
    final Sequence seq = new SumOfLikePowersSequence(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), false);
    while (true) {
      System.out.println(seq.next());
    }
  }
}
