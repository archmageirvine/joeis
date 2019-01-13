package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014842.
 * @author Sean A. Irvine
 */
public class A014842 extends A014837 {

  private final A014841 mA = new A014841();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
