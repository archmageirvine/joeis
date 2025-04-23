package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076920 Highest common factor of a pair of successive terms of A076919.
 * @author Sean A. Irvine
 */
public class A076920 extends A076919 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return Functions.GCD.z(t, mA);
  }
}

