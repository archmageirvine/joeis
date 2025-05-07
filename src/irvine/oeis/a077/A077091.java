package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077091 Composites c, such that when iteration of f(k) = phi(sigma(k)-phi(k)) is started at c it ends at a fixed point &gt; 1.
 * @author Sean A. Irvine
 */
public class A077091 extends A002808 {

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n).subtract(Functions.PHI.z(n)));
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final HashSet<Z> seen = new HashSet<>();
      Z t = c;
      seen.add(t);
      while (seen.add(t = f(t))) {
        // do nothing
      }
      if (!t.isOne() && t.equals(f(t))) {
        return c;
      }
    }
  }
}

