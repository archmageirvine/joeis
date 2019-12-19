package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024192 Integer part of (4th elementary symmetric function of <code>3,4,...,n+5)/(3+4+...+n+5)</code>.
 * @author Sean A. Irvine
 */
public class A024192 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(15).add(450).multiply(mN).add(5165).multiply(mN).add(26922).multiply(mN).add(53848)
      .multiply(mN + 2).multiply(mN + 1).multiply(mN).divide(mN + 8).divide(2880);
  }
}

