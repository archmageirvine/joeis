package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308496 Numbers with digits 1,2,4,7 when written in base 8.
 * @author Sean A. Irvine
 */
public class A308496 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long m = n;
    int syn = 0;
    while (m != 0) {
      syn |= 1 << (m & 7);
      m >>>= 3;
    }
    return (syn & 0b01101001) == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
