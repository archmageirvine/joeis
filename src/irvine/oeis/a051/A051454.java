package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A051454 a(n) is the smallest prime factor of 1 + lcm(1..k) where k is the n-th prime power A000961(n).
 * @author Sean A. Irvine
 */
public class A051454 extends A051452 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).toZArray()[0];
  }
}
