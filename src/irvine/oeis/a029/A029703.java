package irvine.oeis.a029;

import irvine.oeis.a003.A003172;

/**
 * A029703 <code>Q(sqrt(n))</code> has class number 3.
 * @author Sean A. Irvine
 */
public class A029703 extends A003172 {

  @Override
  protected long targetClassNumber() {
    return 3;
  }
}
