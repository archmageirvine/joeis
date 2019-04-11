package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018858 <code>3^a(n)</code> is smallest power of 3 beginning with n.
 * @author Sean A. Irvine
 */
public class A018858 extends A018857 {

  private int mN = 0;

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
