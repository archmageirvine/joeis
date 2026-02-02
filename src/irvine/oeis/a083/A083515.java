package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002275;

/**
 * A083515 Smallest number k such that R(n) + k is a square, where R(n) = A002275.
 * @author Sean A. Irvine
 */
public class A083515 extends Sequence1 {

  private final Sequence mR = new A002275().skip();

  @Override
  public Z next() {
    final Z r = mR.next();
    final Z s = r.sqrt();
    return r.auxiliary() == 1 ? Z.ZERO : s.add(1).square().subtract(r);
  }
}

