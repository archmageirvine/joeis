package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002487;

/**
 * A071885 Trajectory of 38 under map x -&gt; A002487(x)*A002487(x+1).
 * @author Sean A. Irvine
 */
public class A071885 extends Sequence0 {

  private final A002487 mSeq = new A002487();
  private Z mX = null;

  @Override
  public Z next() {
    mX = mX == null ? Z.valueOf(38) : mSeq.a(mX).multiply(mSeq.a(mX.add(1)));
    return mX;
  }
}
