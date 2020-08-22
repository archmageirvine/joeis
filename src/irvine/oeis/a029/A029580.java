package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029580 a(n+1) = [ A*a(n)+B ]/p^r, where p^r is the highest power of p diving [ A*a(n)+B ] and p=2, A=2.00013, B=3.0.
 * @author Sean A. Irvine
 */
public class A029580 implements Sequence {

  private static final Q C = new Q(200013, 100000);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : C.multiply(mA).add(3).toZ().makeOdd();
    return mA;
  }
}
