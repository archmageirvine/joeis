package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A387142 a(n) is the smallest integer k &gt;= 2 such that the digit string of prime(n) is contained as a substring in the digit string of prime(n)^k.
 * @author Sean A. Irvine
 */
public class A387142 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    int e = 1;
    while (!p.pow(++e).toString().contains(s)) {
      // do nothing
    }
    return Z.valueOf(e);
  }
}
