package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a091.A091018;

/**
 * A056536 Mapping from half-antidiagonal reading of the triangle (as used in A028297) to the column-by-column reading of the triangular tables.
 * @author Sean A. Irvine
 */
public class A056536 extends A091018 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
