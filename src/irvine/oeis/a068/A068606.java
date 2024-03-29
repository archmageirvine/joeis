package irvine.oeis.a068;
// Generated by gen_seq4.pl trisimple/trisimard at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A068606 Square table by antidiagonals of T(n,k)=n*k*(n+k+1).
 * @author Georg Fischer
 */
public class A068606 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A068606() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n * (long) k).multiply(n + k + 1);
  }
}
