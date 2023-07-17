package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051146 Sequence b(n) mentioned in A051145.
 * @author Sean A. Irvine
 */
public class A051146 extends A051145 {

  private Z mA = super.next();

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.or(mA);
  }
}
