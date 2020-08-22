package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005549 Number of n-step self-avoiding walks on hexagonal lattice from (0,0) to (0,3).
 * @author Sean A. Irvine
 */
public class A005549 extends A003290 {

  @Override
  protected int first() {
    return 3;
  }

  @Override
  protected long search() {
    final int tx = 6;
    final int ty = 0;
    // return search(0, 0, tx, ty, mN, 1); // Basic search
    // Expanding first few links to exploit symmetries
    use(0, 0);
    long total = search(1, 1, tx, ty, mN - 1, 2);
    total += search(-1, 1, tx, ty, mN - 1, 2);
    use(-2, 0);
    total += search(-4, 0, tx, ty, mN - 2, 1);
    total += search(-1, 1, tx, ty, mN - 2, 2);
    total += search(-3, 1, tx, ty, mN - 2, 2);
    clear(-2, 0);
    use(2, 0);
    total += search(4, 0, tx, ty, mN - 2, 1);
    total += search(1, 1, tx, ty, mN - 2, 2);
    total += search(3, 1, tx, ty, mN - 2, 2);
    clear(2, 0);
    clear(0, 0);
    return total;
  }

}
