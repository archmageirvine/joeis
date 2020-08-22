package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028948 An "extremely strange sequence": a(n+1) = [ A*a(n)+B ]/p^r, where p^r is the highest power of p dividing [ A*a(n)+B ] and p=2, A=4.001, B=1.2.
 * @author Sean A. Irvine
 */
public class A028948 implements Sequence {

  private static final Q A = new Q(4001, 1000);
  private static final Q B = new Q(12, 10);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : A.multiply(mA).add(B).toZ().makeOdd();
    return mA;
  }
}

