package irvine.oeis.a029;

import irvine.oeis.a003.A003172;

/**
 * A029705 Squarefree n such that <code>Q(sqrt(n))</code> has class number 5.
 * @author Sean A. Irvine
 */
public class A029705 extends A003172 {

  @Override
  protected long targetClassNumber() {
    return 5;
  }
}
