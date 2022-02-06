package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053172;
import irvine.oeis.a053.A053174;

/**
 * A054468 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which generate a group of order six under binary matrix multiplication.
 * @author Sean A. Irvine
 */
public class A054468 extends A053172 {

  private final Sequence mA = new A053174();

  @Override
  public Z next() {
    return super.next().add(mA.next().multiply2());
  }
}
