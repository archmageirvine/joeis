package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039680 Concatenate Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039680 extends A039672 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
