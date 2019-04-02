package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000905;

/**
 * A006719 a(n) = A000905(n) + 1.
 * @author Sean A. Irvine
 */
public class A006719 extends A000905 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
