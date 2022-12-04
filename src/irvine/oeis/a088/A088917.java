package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a001.A001850;

/**
 * A088917 Central Delannoy numbers (mod 3); Characteristic function for Cantor set.
 * @author Georg Fischer
 */
public class A088917 extends A001850 {

  @Override
  public Z next() {
    // a(n) = A001850(n)-3*floor(A001850(n)/3).
    final Z a1850 = super.next();
    return a1850.subtract(a1850.divide(3).multiply(3));
  }
}
