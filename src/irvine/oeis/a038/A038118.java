package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038118 Lexicographically earliest strictly increasing base 9 autovarious sequence: a(n) = number of distinct a(k) mod 9^n (written in base 9).
 * @author Sean A. Irvine
 */
public class A038118 extends A037090 {

  @Override
  protected int base() {
    return 9;
  }
}
