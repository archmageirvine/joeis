package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a002.A002371;

/**
 * A060282 Periodic part of decimal expansion of reciprocal of n-th prime (leading 0's omitted).
 * @author Sean A. Irvine
 */
public class A060282 extends A002371 {

  @Override
  public Z next() {
    return Z.TEN.pow(super.next()).divide(mP);
  }
}
