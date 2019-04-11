package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005550 Number of n-step self-avoiding walks on hexagonal lattice from <code>(0,0)</code> to <code>(1,2)</code>.
 * @author Sean A. Irvine
 */
public class A005550 extends A003290 {

  @Override
  protected int first() {
    return 3;
  }

  @Override
  protected long search() {
    return search(0, 0, 5, 1, mN, 1);
  }

}
