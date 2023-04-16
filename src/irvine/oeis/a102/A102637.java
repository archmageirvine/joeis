package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;
import irvine.oeis.a011.A011379;
import irvine.oeis.a027.A027444;

/**
 * A102637 Interleaved reading of A000578(n), A011379(n) and A027444(n).
 * @author Georg Fischer
 */
public class A102637 extends Sequence1 {

  private int mN = 0;
  private final Sequence[] mSeqs = {new A000578(), new A011379(), new A027444()};

  {
    mSeqs[0].next();
    mSeqs[1].next();
    mSeqs[1].next();
    mSeqs[2].next();
  }

  @Override
  public Z next() {
    ++mN;
    return mN < 4 ? mSeqs[0].next() : mSeqs[mN % 3].next();
  }
}
