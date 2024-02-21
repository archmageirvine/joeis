package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003415;

/**
 * A068512 Numerators of arithmetic derivative of n/2: A003415(n)/2 - n/4; denominators: A010685.
 * @author Sean A. Irvine
 */
public class A068512 extends Sequence1 {

  private final Sequence mSeq = new A003415().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return new Q(mSeq.next(), Z.TWO).subtract(new Q(++mN, 4)).num();
  }
}

