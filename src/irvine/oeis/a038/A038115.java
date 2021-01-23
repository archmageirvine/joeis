package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038115 Lexicographically earliest strictly increasing base 6 autovarious sequence: a(n) = number of distinct a(k) mod 6^n (written in base 6).
 * @author Sean A. Irvine
 */
public class A038115 extends A037090 {

  @Override
  protected int base() {
    return 6;
  }
}
