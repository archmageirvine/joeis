package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002034;
import irvine.oeis.a066.A066272;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073569 extends Sequence1 {

  private final DirectSequence mAnti = new A066272();
  private final Sequence mKempner = new A002034();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mKempner.next().equals(mAnti.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
