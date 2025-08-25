package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a386.A386482;

/**
 * A064413.
 * @author Sean A. Irvine
 */
public class A387081 extends A386482 {

  private Z mA = Functions.LPF.z(super.next());
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = Functions.LPF.z(super.next());
      if (!t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
