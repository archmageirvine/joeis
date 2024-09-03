package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007376;

/**
 * A072125 Concatenation of first n entries (digits) of A007376 is not divisible by 3.
 * @author Sean A. Irvine
 */
public class A072125 extends Sequence1 {

  private final Sequence mA = new A007376().skip();
  private long mT = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT *= 10;
      mT += mA.next().longValueExact();
      mT %= 3;
      if (mT != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
