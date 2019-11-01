package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000700;

/**
 * A027360 Triangular array T read by rows: <code>T(n,k) =</code> number of partitions of n into distinct odd parts, the greatest being <code>&gt;=</code> k.
 * @author Sean A. Irvine
 */
public class A027360 extends A027356 {

  private final Sequence mA = new A000700();
  private int mN = 0;
  private int mM = 0;
  private Z mS = mA.next();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mS = mA.next();
    }
    mS = mS.subtract(t(mN, mM - 1));
    return mS;
  }
}
