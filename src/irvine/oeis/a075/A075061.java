package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A075061 Triangle in A075059 read by rows.
 * @author Sean A. Irvine
 */
public class A075061 extends Sequence1 {

  private final Sequence mSeq = new A075059().skip();
  private int mN = 0;
  private int mM = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mA = mSeq.next();
    }
    return mA.add(mM);
  }
}

