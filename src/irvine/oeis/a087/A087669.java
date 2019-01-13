package irvine.oeis.a087;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A087669.
 * @author Sean A. Irvine
 */
public class A087669 implements Sequence {

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

