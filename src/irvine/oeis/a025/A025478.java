package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A025478 Least roots of perfect powers <code>(A001597)</code>.
 * @author Sean A. Irvine
 */
public class A025478 extends A001597 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Z a = t.isPower();
    return a == null ? Z.ONE : a;
  }
}

