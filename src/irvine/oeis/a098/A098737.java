package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A098737 Triangle read by rows: number of triangles formed by lines from two vertices of a triangle to the opposite side that segment the opposite sides into m and n segments. Since f(m,n) = f(n,m), it suffices to give the results in a triangular table.
 * @author Georg Fischer
 */
public class A098737 extends BaseTriangle {

  /** Construct the sequence. */
  public A098737() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int m, final int n) {
    return Z.valueOf(m + n).multiply(m).multiply(n).divide2();
  }
}
