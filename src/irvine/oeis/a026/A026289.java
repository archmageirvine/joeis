package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A026289 a(n) = number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, s(1) = 1, s(n) = 3, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1 if s(2) = 1. Also a(n) = T(n,n-3), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026289 extends Sequence3 {

  private Z mA = Z.ZERO;
  private final A026124 mSeq = new A026124();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq.next();
    return mA.add(t);
  }
}
