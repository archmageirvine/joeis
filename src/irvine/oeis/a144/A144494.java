package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A144494 a(n) = 0 if n is prime, otherwise A001222(n).
 * @author Sean A. Irvine
 */
public class A144494 extends A001222 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.ONE.equals(t) ? Z.ZERO : t;
  }
}

