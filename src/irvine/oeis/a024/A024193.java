package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024193 Integer part of (3rd elementary symmetric function of S(n))/(2nd elementary symmetric of S(n)), where S(n) = {3,4, ..., n+4}.
 * @author Sean A. Irvine
 */
public class A024193 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.add(13).multiply(mN).add(46).multiply(mN + 7).multiply(mN)
      .divide(n.multiply(3).add(41).multiply(mN).add(144).multiply2());
  }
}

