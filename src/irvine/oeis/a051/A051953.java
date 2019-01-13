package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A051953.
 * @author Sean A. Irvine
 */
public class A051953 extends A000010 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}

