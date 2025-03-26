package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a050.A050435;

/**
 * A076237 Remainder when 2nd order composite cc[n]=A050435[n] is divided by n.
 * @author Sean A. Irvine
 */
public class A076237 extends A050435 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().modZ(++mN);
  }
}
