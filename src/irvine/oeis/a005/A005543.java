package irvine.oeis.a005;

import irvine.oeis.a003.A003288;

/**
 * A005543.
 * @author Sean A. Irvine
 */
public class A005543 extends A003288 {

  @Override
  protected long search() {
    final int tx = 0;
    final int ty = 2;
    final int tz = 2;
    //return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
    use(0, 0, 0);
    return search(0, 1, 1, tx, ty, tz, mN - 1, 1)
      + search(0, -1, -1, tx, ty, tz, mN - 1, 1)
      + search(0, 1, -1, tx, ty, tz, mN - 1, 2)
      + search(1, -1, 0, tx, ty, tz, mN - 1, 4)
      + search(1, 1, 0, tx, ty, tz, mN - 1, 4);
  }
}
