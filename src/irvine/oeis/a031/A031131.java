package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A031131 Difference between n-th prime and <code>(n+2)-nd</code> prime.
 * @author Sean A. Irvine
 */
public class A031131 extends A001223 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA);
  }
}

