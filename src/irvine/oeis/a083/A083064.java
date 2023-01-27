package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A083064 Square number array T(n,k) = (k*(k+2)^n+1)/(k+1) read by antidiagonals.
 * @author Georg Fischer
 */
public class A083064 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A083064() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k + 2).pow(n).multiply(k).add(1).divide(k + 1);
  }
}
