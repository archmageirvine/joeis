package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024190 [ (2nd elementary symmetric function of 3,4,...,n+3)/(3+4+...+n+3) ].
 * @author Sean A. Irvine
 */
public class A024190 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3).add(35).multiply(mN).add(106).multiply(mN).divide(mN + 6).divide(12);
  }
}

