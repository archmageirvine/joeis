package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008345 <code>a(n+1) =</code> a(n)-b(n+1) if <code>a(n) &gt;=</code> b(n+1) else a(n)+b(n+1), where {b(n)} are the triangular numbers A000217.
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


