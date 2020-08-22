package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024501 [ C(4n,2n)/C(4n,n) ].
 * @author Sean A. Irvine
 */
public class A024501 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, 2 * mN).divide(Binomial.binomial(4 * mN, mN));
  }
}
