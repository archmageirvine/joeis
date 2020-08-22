package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023385 a(n+1) = a(n) converted to base 8 from base 6 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023385 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : new Z(mA.toString(6), 8);
    return mA;
  }
}
