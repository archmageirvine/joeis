package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003415;

/**
 * A068220.
 * @author Sean A. Irvine
 */
public class A068237 extends Sequence1 {

  private final Sequence mSeq = new A003415().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return new Q(mSeq.next().negate(), Z.valueOf(++mN).square()).num();
  }
}
