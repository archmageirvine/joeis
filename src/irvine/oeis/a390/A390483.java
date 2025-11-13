package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002819;

/**
 * A390483 allocated for Henri Lifchitz.
 * @author Sean A. Irvine
 */
public class A390483 extends Sequence0 {

  private final Sequence mS = new A002819();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN * 2;
    while (mM < mN) {
      mS.next();
      ++mM;
    }
    ++mM;
    return mS.next();
  }
}
