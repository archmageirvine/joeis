package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;

/**
 * A081288 a(n) is the minimal i such that A000108(i) &gt; n.
 * @author Sean A. Irvine
 */
public class A081288 extends Sequence0 {

  private final Sequence mCatalan = new A000108();
  private Z mC = mCatalan.next();
  private long mN = -1;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mC.compareTo(mN) <= 0) {
      mC = mCatalan.next();
      mM = mM.add(1);
    }
    return mM;
  }
}

