package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038113 Lexicographically earliest strictly increasing base 4 autovarious sequence: a(n) = number of distinct a(k) mod 4^n (written in base 4).
 * @author Sean A. Irvine
 */
public class A038113 extends A037090 {

  @Override
  protected int base() {
    return 4;
  }
}
