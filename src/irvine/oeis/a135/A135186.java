package irvine.oeis.a135;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A135186 Numbers n that raised to the powers from 1 to k (with k&gt;=1) are multiples of the sums of their digits (and n raised to the power k+1 is not such a multiple). Case k=1.
 * @author Georg Fischer
 */
public class A135186 extends AbstractSequence {

  private int mN;
  private int mK;

  /** Construct the sequence. */
  public A135186() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param k limit of powers
   */
  public A135186(final int offset, final int k) {
    super(offset);
    mN = 0;
    mK = k;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z prod = Z.valueOf(mN);
      int i = 1; // runs up to mK
      boolean busy = true;
      while (busy && Predicates.HARSHAD.is(prod)) {
        busy = ++i <= mK;
        prod = prod.multiply(mN);
      }
      if (i - 1 == mK) {
        if (!Predicates.HARSHAD.is(prod)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
