package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051791 Numbers that are unchanged when turned upside down, when written in a font in which 7 looks like upside-down 2).
 * @author Sean A. Irvine
 */
public class A051791 extends Sequence1 {

  private static final long[] INVERT = {0, 1, 7, -1, -1, -1, 9, 2, 8, 6};
  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      long t = ++mN;
      long upsideDown = 0;
      while (t != 0) {
        final long y = INVERT[(int) (t % 10)];
        if (y < 0) {
          continue outer;
        }
        upsideDown *= 10;
        upsideDown += y;
        t /= 10;
      }
      if (upsideDown == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

