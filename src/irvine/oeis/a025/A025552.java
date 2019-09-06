package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A025552 LCM of <code>{C(0,0), C(1,0)</code>, ..., <code>C(n, floor(n/2))}</code>.
 * @author Sean A. Irvine
 */
public class A025552 extends A003418 {

  private long mN = -1;

  private long b(final long n) {
    final long m = (n + 2) & ~1;
    return (m & (m - 1)) == 0 ? 1 : 2;
  }

  @Override
  public Z next() {
    return super.next().divide(b(++mN));
  }
}
