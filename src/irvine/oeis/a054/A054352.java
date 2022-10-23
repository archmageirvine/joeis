package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A054352 Lengths of successive generations of the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A054352 extends Sequence0 {

  private final Sequence mA = new A054353();
  private long mS = 1;
  private long mT = 0;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long s = mS;
    while (mT < s) {
      mS = mA.next().longValueExact();
      ++mT;
    }
    ++mS;
    return Z.valueOf(mS);
  }
}
