package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A072479 Surface area of n-dimensional sphere of radius r is n*V_n*r^(n-1) = n*Pi^(n/2)*r^(n-1)/(n/2)! = S_n*Pi^floor(n/2)*r^(n-1); sequence gives denominator of S_n.
 * @author Sean A. Irvine
 */
public class A072479 extends Sequence0 {

  private final Sequence mNum = new A072345();
  private final Sequence mDen = new A072346();
  private long mN = -1;

  @Override
  public Z next() {
    return new Q(mNum.next(), mDen.next()).multiply(++mN).den();
  }
}

