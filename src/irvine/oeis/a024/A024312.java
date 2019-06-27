package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024312 <code>a(n) = s(1)s(n) + s(2)s(n-1) + ... + s(k)s(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A024312 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z b = mN.add(1).divide2();
    return mN.multiply(15).add(38).add(mN.multiply(b).multiply(3)).subtract(b.square().multiply2()).multiply(b).divide(6);
  }
}
