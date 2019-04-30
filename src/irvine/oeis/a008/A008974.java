package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008974 Triangular number <code>t(n)</code> raised to power <code>t(n)</code>.
 * @author Sean A. Irvine
 */
public class A008974 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.pow(t.intValueExact());
  }
}

