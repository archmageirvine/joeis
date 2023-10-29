package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;

/**
 * A066562 Smallest Bell number (A000110) divisible by n, if such a number exists, otherwise 0.
 * @author Sean A. Irvine
 */
public class A066562 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 7) == 0) {
      return Z.ZERO;
    }
    final Sequence bell = new A000110();
    while (true) {
      final Z b = bell.next();
      if (b.mod(mN) == 0) {
        return b;
      }
    }
  }
}
