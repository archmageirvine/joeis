package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Apply the greedy algorithm for an Egyptian fraction expansion of a real number.
 * The terms of the resulting sequence are the denominators of the unit fractions
 * whose sum approximates the real number. 
 * There are some variants of the greedy algorithm, which are specified by the
 * bits (powers of 2) in the <code>features</code> parameter:
 * <ul>
 * <li>0 - no feature, leading ones are accumulated</li>
 * <li>1 - leading ones are dropped</li>
 * <li>2 - alternate signs, start with +</li>
 * <li>4 - alternate signs, start with -</li>
 * <li>8 - odd denominators only</li>
 * </ul>
 * Tehf features can be added. Currently only 0, 1 are implemented.
 * @author Georg Fischer
 */
public class EgyptianFractionSequence implements Sequence {

  protected CR mEgyptian; // for the iterative calculation of the Egyptian fraction
  protected int mFeatures; // bitmask for variants

  /**
   * Construct the Egyptian fraction of the given number
   * without additional features.
   * @param realNumber number to be expanded
   */
  public EgyptianFractionSequence(final CR realNumber) {
    this(realNumber, 0);
  }

  /**
   * Construct the Egyptian fraction of the given number.
   * @param realNumber number to be expanded
   * @param features bitmask for variant(s)
   */
  public EgyptianFractionSequence(final CR realNumber, final int features) {
    mEgyptian = realNumber;
    mFeatures = features;
    if ((mFeatures & 1) == 1) {
      next(); // remove the first term
    }
  }

  @Override
  public Z next() {
    Z result = mEgyptian.inverse().ceil();
    mEgyptian = mEgyptian.subtract(CR.valueOf(result).inverse());
    if (result.equals(Z.ONE)) { // add the next terms as long as they are Z.ONE
      Z den = mEgyptian.inverse().ceil();
      while (den.equals(Z.ONE)) {
        result = result.add(den);
        mEgyptian = mEgyptian.subtract(CR.valueOf(den).inverse());
        den = mEgyptian.inverse().ceil();
      } // while ones
    } // if one
    return result;
  }
}
