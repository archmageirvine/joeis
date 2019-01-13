package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005552.
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
