package irvine.oeis.a003;

/**
 * A003287 Number of n-step self-avoiding walks on f.c.c. lattice from <code>(0,0,0)</code> to <code>(0,1,1)</code>.
 * @author Sean A. Irvine
 */
public class A003287 extends A003288 {

  @Override
  protected int first() {
    return 1;
  }

  @Override
  protected long search() {
    final int tx = 0;
    final int ty = 1;
    final int tz = 1;
    //return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
    use(0, 0, 0);
    return search(0, 1, 1, tx, ty, tz, mN - 1, 1)
      + search(0, -1, -1, tx, ty, tz, mN - 1, 1)
      + search(0, 1, -1, tx, ty, tz, mN - 1, 2)
      + search(1, -1, 0, tx, ty, tz, mN - 1, 4)
      + search(1, 1, 0, tx, ty, tz, mN - 1, 4);
  }
}
