package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000051;
import irvine.oeis.a038.A038507;

/**
 * A068481 Numbers k such that gcd(k!+1, 2^k+1) &gt; 1.
 * @author Sean A. Irvine
 */
public class A068481 extends Sequence1 {

  private final Sequence mA = new A000051().skip();
  private final Sequence mB = new A038507().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().gcd(mB.next()).compareTo(Z.ONE) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

