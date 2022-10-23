package irvine.oeis.a087;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087669 The smallest index m such that b(m) is an integer, where b(0)=(2n+1)/n and b(k+1)=b(k)*floor(b(k)) for k&gt;=0.
 * @author Sean A. Irvine
 */
public class A087669 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q b = new Q(2 * mN + 1, mN);
    long c = 0;
    while (!b.isInteger()) {
      ++c;
      b = b.multiply(b.toZ());
    }
    return Z.valueOf(c);
  }
}

