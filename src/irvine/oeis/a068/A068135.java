package irvine.oeis.a068;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A068135 Smallest prime ending in reverse concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A068135 extends A000422 {

  @Override
  public Z next() {
    return Puma.smallestPrimeEndingWith(super.next());
  }
}
