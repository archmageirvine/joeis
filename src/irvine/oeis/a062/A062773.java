package irvine.oeis.a062;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * A062773 Index of the smallest prime which follows square of n-th prime.
 * @author Sean A. Irvine
 */
public class A062773 extends A062772 {

  @Override
  public Z next() {
    return Puma.primePiZ(super.next());
  }
}
