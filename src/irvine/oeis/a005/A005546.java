package irvine.oeis.a005;

import irvine.oeis.a003.A003288;

/**
 * A005546 Number of n-step self-avoiding walks on f.c.c. lattice from (0,0,0) to (0,3,3).
 * @author Sean A. Irvine
 */
public class A005546 extends A003288 {

  /** Construct the sequence. */
  public A005546() {
    super(3);
  }

  @Override
  protected int first() {
    return 3;
  }

  @Override
  protected long search() {
    final int tx = 0;
    final int ty = 3;
    final int tz = 3;
    //return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
    use(0, 0, 0);
    return search(0, 1, 1, tx, ty, tz, mN - 1, 1)
      + search(0, -1, -1, tx, ty, tz, mN - 1, 1)
      + search(0, 1, -1, tx, ty, tz, mN - 1, 2)
      + search(1, -1, 0, tx, ty, tz, mN - 1, 4)
      + search(1, 1, 0, tx, ty, tz, mN - 1, 4);
  }
}
