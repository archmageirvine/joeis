package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038117 Lexicographically earliest strictly increasing base 8 autovarious sequence: a(n) = number of distinct a(k) mod 8^n (written in base 8).
 * @author Sean A. Irvine
 */
public class A038117 extends A037090 {

  @Override
  protected int base() {
    return 8;
  }
}
