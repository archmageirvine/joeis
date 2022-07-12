package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057930 Sequence b(n) mentioned in A057929.
 * @author Sean A. Irvine
 */
public class A057930 extends A057929 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.or(mA);
  }
}
