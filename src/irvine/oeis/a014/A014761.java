package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014761.
 * @author Sean A. Irvine
 */
public class A014761 extends A014475 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
