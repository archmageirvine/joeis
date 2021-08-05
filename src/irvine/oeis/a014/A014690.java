package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A014690 a(n) = n + prime(n+1).
 * @author Sean A. Irvine
 */
public class A014690 extends A065091 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
