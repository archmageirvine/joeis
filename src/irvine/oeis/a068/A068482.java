package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000225;
import irvine.oeis.a038.A038507;

/**
 * A068482 Numbers n such that gcd(n!+1,2^n-1)&gt;1.
 * @author Sean A. Irvine
 */
public class A068482 extends Sequence1 {

  private final Sequence mA = new A000225().skip();
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

