package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a007.A007400;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073097 extends Sequence0 {

  private final Sequence mA = new A007400();
  private long mCount = -1;

  @Override
  public Z next() {
    final Z t = mA.next();
    if (Z.FOUR.equals(t)) {
      ++mCount;
    } else if (Z.TWO.equals(t) || Z.SIX.equals(t)) {
      --mCount;
    }
    return Z.valueOf(mCount);
  }
}
