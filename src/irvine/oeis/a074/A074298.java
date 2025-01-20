package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A074298 First occurrence of an 'average' valued sequence of length 2n in the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A074298 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence kolakoski1 = new A000002();
    final Sequence kolakoski2 = new A000002();
    int t = 0;
    for (long k = 0; k < 2L * mN; ++k) {
      t += kolakoski1.next().longValue();
    }
    long pos = 1;
    while (true) {
      if (t == 3 * mN) {
        return Z.valueOf(pos);
      }
      t -= kolakoski2.next().longValue();
      t += kolakoski1.next().longValue();
      ++pos;
    }
  }
}
