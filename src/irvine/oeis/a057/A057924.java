package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057924 Sequence b(n) mentioned in A057923.
 * @author Sean A. Irvine
 */
public class A057924 extends A057923 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.or(mA);
  }
}
