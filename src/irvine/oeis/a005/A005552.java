package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005552 Number of <code>n-step self-avoiding</code> walks on hexagonal lattice from <code>(0,0)</code> to <code>(1,3)</code>.
 * @author Sean A. Irvine
 */
public class A005552 extends A003290 {

  @Override
  protected int first() {
    return 4;
  }

  @Override
  protected long search() {
    return search(0, 0, 7, 1, mN, 1);
  }

}
