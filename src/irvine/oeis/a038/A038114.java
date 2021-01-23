package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038114 Lexicographically earliest strictly increasing base 5 autovarious sequence: a(n) = number of distinct a(k) mod 5^n (written in base 5).
 * @author Sean A. Irvine
 */
public class A038114 extends A037090 {

  @Override
  protected int base() {
    return 5;
  }
}
