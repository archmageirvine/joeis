package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000378;
import irvine.oeis.a071.A071609;

/**
 * A071609.
 * @author Sean A. Irvine
 */
public class A076180 extends A071609 {

  private final Sequence mA = new A000378();
  private long mK = -1;

  @Override
  public Z next() {
    final Z v = super.next();
    while (true) {
      ++mK;
      if (mA.next().equals(v)) {
        return Z.valueOf(mK);
      }
    }
  }
}
