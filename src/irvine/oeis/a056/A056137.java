package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a046.A046079;

/**
 * A056137 Number of ways in which n can be the longer leg (middle side) of an integer-sided right triangle.
 * @author Sean A. Irvine
 */
public class A056137 extends A046079 {

  private final A056138 mA = new A056138();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
