package irvine.oeis.a014;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014056 Nearest integer to (n + 1/n)^n.
 * @author Sean A. Irvine
 */
public class A014056 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return new Q(1, ++mN).add(mN).pow(mN).add(Q.HALF).toZ();
  }
}
