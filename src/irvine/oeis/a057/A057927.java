package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057927 Sequence b(n) mentioned in A057926.
 * @author Sean A. Irvine
 */
public class A057927 extends A057926 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.or(mA);
  }
}
