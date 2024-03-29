package irvine.oeis.a106;
// Generated by gen_seq4.pl triuple at 2021-10-25 19:35

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A106314 Triangle T(n,k) composed of the squares min(n,k)^2.
 * @author Georg Fischer
 */
public class A106314 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A106314() {
    super(1, 1, -1);
  }
  
  @Override
  public Z matrixElement(final int i, final int j) {
    return Z.valueOf(Math.min(i * i, j * j));
  }
}
