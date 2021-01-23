package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008345 a(n+1) = a(n)-b(n+1) if a(n) &gt;= b(n+1) else a(n)+b(n+1), where {b(n)} are the triangular numbers A000217.
 * @author Sean A. Irvine
 */
public class A008345 extends A000217 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = super.next();
    mA = mA.signedAdd(mA.compareTo(t) < 0, t);
    return mA;
  }
}


