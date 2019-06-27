package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024306 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where <code>k=[ (n+1)/2) ], s =</code> (natural numbers <code>&gt;= 2), t =</code> (natural numbers <code>&gt;= 3)</code>.
 * @author Sean A. Irvine
 */
public class A024306 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(4).add(45).multiply(mN).add(116).multiply(mN).add(48).signedAdd((mN & 1) == 1, Z.valueOf(mN + 4).square().multiply(3)).divide(48);
  }
}
