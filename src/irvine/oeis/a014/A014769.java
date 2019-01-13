package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014769.
 * @author Sean A. Irvine
 */
public class A014769 extends A014632 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
