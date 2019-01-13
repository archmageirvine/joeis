package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014793.
 * @author Sean A. Irvine
 */
public class A014793 extends A014641 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
