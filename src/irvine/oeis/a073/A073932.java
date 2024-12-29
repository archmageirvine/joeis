package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060681;

/**
 * A073929.
 * @author Sean A. Irvine
 */
public class A073932 extends Sequence1 {

  private final DirectSequence mF = DirectSequence.create(new A060681());
  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (mK <= 1) {
      mK = ++mN;
    } else {
      mK = mF.a(mK).intValueExact();
    }
    return Z.valueOf(mK);
  }
}

