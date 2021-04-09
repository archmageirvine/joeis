package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;

/**
 * A046344 Sum of the prime factors of the odd composite numbers (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046344 extends A071904 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sopfr();
  }
}
