package irvine.oeis.a033;

import irvine.oeis.a006.A006988;

/**
 * A033844 a(n) = prime(2^n).
 * @author Sean A. Irvine
 */
public class A033844 extends A006988 {

  @Override
  protected long base() {
    return 2;
  }
}
