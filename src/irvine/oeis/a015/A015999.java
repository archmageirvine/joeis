package irvine.oeis.a015;

import irvine.oeis.a016.A016006;

/**
 * A015999 a(n) = (tau(n^5) + 4)/5.
 * @author Sean A. Irvine
 */
public class A015999 extends A016006 {

  @Override
  protected int power() {
    return 5;
  }
}
