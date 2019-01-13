package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a003.A003278;

/**
 * A004793.
 * @author Sean A. Irvine
 */
public class A004793 extends A003278 {

  @Override
  public Z next() {
    return super.next().add(mN & 1);
  }
}
