package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a055.A055246;

/**
 * A062548 Even integers that are not partial sums of A062547.
 * @author Sean A. Irvine
 */
public class A062548 extends A055246 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
