package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018856.
 * @author Sean A. Irvine
 */
public class A018856 extends A018802 {

  private int mN = 0;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    int b = -1;
    while (true) {
      if (pow2(++b).startsWith(target)) {
        return Z.valueOf(b);
      }
    }
  }
}
