package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003958;

/**
 * A064522 For an integer n with prime factorization p1*p2*p3* ... *pn let n* = (p1-1)*(p2-1)*(p3-1)* ... *(pn-1) (A003958); sequence gives n such that n is divisible by n*.
 * @author Sean A. Irvine
 */
public class A064522 extends Sequence1 {

  private final Sequence mA = new A003958();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(mA.next()).isZero()) {
        return mN;
      }
    }
  }
}

