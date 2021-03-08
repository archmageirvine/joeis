package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a001.A001067;

/**
 * A043303 Numerator of B(4n+2)/(2n+1) where B(m) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A043303 extends A001067 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}

