package irvine.oeis.a094;
// Generated by gen_seq4.pl trisimple/trisimara at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A094250 Array, A(n, k) = ((n+2)^(k+1) + (k+1)*n*(n+1) - 1)/(n+1)^2, read by antidiagonals.
 * @author Georg Fischer
 */
public class A094250 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A094250() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + 2).pow(k + 1).subtract((long) (k + 1) * (n + 1) + 1).divide((long) (n + 1) * (n + 1)).add(k + 1);
  }
}
