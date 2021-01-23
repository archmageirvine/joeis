package irvine.oeis.a015;

import irvine.oeis.a016.A016006;

/**
 * A015995 a(n) = (tau(n^3)+2)/3.
 * @author Sean A. Irvine
 */
public class A015995 extends A016006 {

  @Override
  protected int power() {
    return 3;
  }
}
