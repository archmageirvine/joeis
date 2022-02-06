package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a053.A053171;

/**
 * A054466 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which generate a group of order two under binary matrix multiplication.
 * @author Sean A. Irvine
 */
public class A054466 extends A053171 {

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
