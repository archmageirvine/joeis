package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001037;
import irvine.oeis.a086.A086908;

/**
 * A001037.
 * @author Sean A. Irvine
 */
public class A073961 extends A086908 {

  private final DirectSequence mB = new A001037();
  private Z mSum = mB.next().add(1);

  @Override
  public Z next() {
    mSum = mSum.add(mB.next());
    return super.next().subtract(mSum);
  }
}
