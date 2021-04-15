package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037090 Lexicographically earliest strictly increasing base-2 autovarious sequence: a(n) = number of distinct a(k) mod 2^n (written in base 2).
 * @author Sean A. Irvine
 */
public class A037090 extends A037089 {

  @Override
  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    return new Z(super.next().toString(base()));
  }
}
