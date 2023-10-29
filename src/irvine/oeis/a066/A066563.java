package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000108;

/**
 * A066563 Smallest Catalan number (A000108) divisible by n.
 * @author Sean A. Irvine
 */
public class A066563 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence catalan = new A000108();
    while (true) {
      final Z b = catalan.next();
      if (b.mod(mN) == 0) {
        return b;
      }
    }
  }
}
