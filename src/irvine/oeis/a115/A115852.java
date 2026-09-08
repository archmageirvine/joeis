package irvine.oeis.a115;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A115852 Dihedral D3 elliptical invariant transform on A000045: a[n+1]/a[n]= Phi^4=((1+Sqrt[5])/2)^4.
 * @author Sean A. Irvine
 */
public class A115852 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    final Z f4 = mF.next().pow(4);
    return new Q(f4.subtract(1).square(), f4.multiply(4)).ceiling();
  }
}

