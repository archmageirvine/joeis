package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A081737 a(n) = (n-1)*10 + n-th decimal digit of Pi=3.14159...
 * @author Sean A. Irvine
 */
public class A081737 extends A000796 {

  private long mN = -10;

  @Override
  public Z next() {
    mN += 10;
    return Z.valueOf(mN).add(super.next());
  }
}
