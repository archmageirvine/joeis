package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001469;

/**
 * A102055 Column 1 of A102054, the matrix inverse of A060083 (Euler polynomials).
 * @author Georg Fischer
 */
public class A102055 extends PartialSumSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A102055() {
    super(0, new A001469());
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    // a(n) = 1 - Sum_{k=1, n} A001469(k) for n>0, with a(0)=1.
    return Z.ONE.subtract(super.next());
  }
}
