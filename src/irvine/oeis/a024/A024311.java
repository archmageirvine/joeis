package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a055.A055879;

/**
 * A024311 Catacondensed simply-connected monopentapolyhexes.
 * @author Sean A. Irvine
 */
public class A024311 extends A002212 {

  private Z mU = super.next().subtract(1);
  private final Sequence mVSeq = new A055879();

  @Override
  public Z next() {
    final Z uPrev = mU;
    mU = super.next();
    return mU.subtract(uPrev.multiply2()).subtract(mVSeq.next()).divide2();
  }
}
