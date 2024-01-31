package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004086;

/**
 * A068159 a(n) = floor[ n/R(n) ], where R(n) (A004086) = Digit reversal of n.
 * @author Sean A. Irvine
 */
public class A068159 extends Sequence1 {

  private final Sequence mSeq = new A004086().skip();
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).divide(mSeq.next());
  }
}
