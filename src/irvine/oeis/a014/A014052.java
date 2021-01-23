package irvine.oeis.a014;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014052 a(n) = floor((n+1/n)^n).
 * @author Sean A. Irvine
 */
public class A014052 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return new Q(1, ++mN).add(mN).pow(mN).toZ();
  }
}
