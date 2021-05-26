package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A047893 Number of decimal digits of Euler (Zig) numbers A000364: a(n) = ceiling(log_10(|E(2n)|)), where E is Euler's E function.
 * @author Sean A. Irvine
 */
public class A047893 extends A000364 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.ONE.equals(t) ? Z.ZERO : Z.valueOf(t.toString().length());
  }
}
