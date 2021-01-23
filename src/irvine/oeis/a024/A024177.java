package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024177 a(n) = floor ( (2nd elementary symmetric function of 2,3,...,n+2)/(2+3+...+n+2) ).
 * @author Sean A. Irvine
 */
public class A024177 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3).add(23).multiply(mN).add(46).multiply(mN).divide(mN + 4).divide(12);
  }
}
