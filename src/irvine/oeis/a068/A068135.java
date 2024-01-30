package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068135 extends A000422 {

  @Override
  public Z next() {
    return Puma.smallestPrimeEndingWith(super.next());
  }
}
