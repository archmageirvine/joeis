package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a006.A006753;

/**
 * A050219 Smaller of Smith brothers.
 * @author Sean A. Irvine
 */
public class A050219 extends A006753 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).equals(mA)) {
        return t;
      }
    }
  }
}
