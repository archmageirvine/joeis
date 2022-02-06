package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a053.A053173;

/**
 * A054467 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which generate a group of order four under binary matrix multiplication.
 * @author Sean A. Irvine
 */
public class A054467 extends A053173 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
