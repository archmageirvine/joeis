package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A066959 Bigomega(n^n) where bigomega(x) is the number of prime factors in x (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A066959 extends A001222 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
