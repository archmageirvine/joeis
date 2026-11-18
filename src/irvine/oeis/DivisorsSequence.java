package irvine.oeis;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Create a finite, ordered sequence of all divisors of a single number.
 * @author Georg Fischer
 */
public class DivisorsSequence extends FiniteSequence {

  /**
   * Create a finite sequence of all divisors of a long.
   * @param offset first index of target sequence
   * @param term compute the divisors of this number
   */
  public DivisorsSequence(final int offset, final long term) {
    super(offset, FINITE, Jaguar.factor(term).divisorsSorted());
  }

  /**
   * Create a finite sequence of all divisors of an integer.
   * @param offset first index of target sequence
   * @param term compute the divisors of this number
   */
  public DivisorsSequence(final int offset, final Z term) {
    super(offset, FINITE, Jaguar.factor(term).divisorsSorted());
  }

  /**
   * Compute the divisors of <code>base^exponent - increment</code>.
   * @param offset first index of target sequence
   * @param base number base, usually 2
   * @param exponent the exponent
   * @param increment usually -1
   */
  public DivisorsSequence(final int offset, final long base, final long exponent, final long increment) {
    super(offset, FINITE, Jaguar.factor(
      (base == 2L && exponent < 63 ? Z.ONE.shiftLeft(exponent) : Z.valueOf(base).pow(exponent)
      ).add(increment)).divisorsSorted());
  }

}
