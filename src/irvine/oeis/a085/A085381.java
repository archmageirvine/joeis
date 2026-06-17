package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a070.A070801;

/**
 * A085381 Numbers k such that (greatest prime as sum of distinct divisors of k) &lt; (greatest prime not greater sum of divisors of k).
 * @author Sean A. Irvine
 */
public class A085381 extends Sequence1 {

  private final Sequence mA = new A085379();
  private final Sequence mB = new A070801();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
