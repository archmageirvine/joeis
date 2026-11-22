package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002851;
import irvine.oeis.a006.A006823;

/**
 * A204326 Number of connected cubic graphs on 2n nodes with chromatic number 3.
 * @author Gregory Morse
 */
public class A204326 extends Sequence1 {
  private final Sequence mCubic = new A002851().skip();
  private final A006823 mBipartite = new A006823();
  private int mN = 0;

  @Override
  public Z next() {
    final Z total = mCubic.next();
    return ++mN <= 2 ? Z.ZERO : total.subtract(mBipartite.next());
  }
}
