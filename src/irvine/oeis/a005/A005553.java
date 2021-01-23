package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005553 Number of n-step self-avoiding walks on hexagonal lattice from (0,0) to (2,2).
 * @author Sean A. Irvine
 */
public class A005553 extends A003290 {

  @Override
  protected int first() {
    return 4;
  }

  @Override
  protected long search() {
    //return search(0, 0, 6, 2, mN, 1);
    use(0, 0);
    return search(1, 1, 6, 2, mN - 1, 2) + search(-2, 0, 6, 2, mN - 1, 2) + search(-1, 1, 6, 2, mN - 1, 2);
  }

}
