package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018872 <code>a(n)^5</code> is smallest fifth power beginning with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A018872 extends A018871 {

  private int mN = -1;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (pow(++b).startsWith(target)) {
        return Z.valueOf(b);
      }
    }
  }
}
