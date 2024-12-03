package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a002.A002034;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073535 extends A000005 {

  private final Sequence mKempner = new A002034().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(2).equals(mKempner.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
