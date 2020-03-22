package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A030140 The nonsquares squared.
 * @author Sean A. Irvine
 */
public class A030140 extends A000037 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
