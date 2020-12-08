package irvine.oeis.a037;

/**
 * A037091 Lexicographically earliest strictly increasing base 3 autovarious sequence: a(n) = number of distinct a(k) mod 3^n (written in base 3).
 * @author Sean A. Irvine
 */
public class A037091 extends A037090 {

  @Override
  protected int base() {
    return 3;
  }
}
