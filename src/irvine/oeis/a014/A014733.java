package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014733.
 * @author Sean A. Irvine
 */
public class A014733 extends A014450 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
