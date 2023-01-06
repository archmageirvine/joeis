package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a036.A036459;

/**
 * A060937 Number of iterations of d(n) (A000005) needed to reach 2 starting at n (n is counted).
 * @author Sean A. Irvine
 */
public class A060937 extends A036459 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
