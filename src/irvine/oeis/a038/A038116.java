package irvine.oeis.a038;

import irvine.oeis.a037.A037090;

/**
 * A038116 Lexicographically earliest strictly increasing base 7 autovarious sequence: a(n) = number of distinct a(k) mod 7^n (written in base 7).
 * @author Sean A. Irvine
 */
public class A038116 extends A037090 {

  @Override
  protected int base() {
    return 7;
  }
}
