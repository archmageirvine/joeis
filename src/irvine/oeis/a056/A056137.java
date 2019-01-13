package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a046.A046079;

/**
 * A056137.
 * @author Sean A. Irvine
 */
public class A056137 extends A046079 {

  private A056138 mA = new A056138();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
