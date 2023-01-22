package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061118 Let s(n) be the sequence of squares (A000290). Then this sequence is given by s(1), s(2)s(1)s(3), s(4)s(2)s(1)s(3)s(5), ...
 * @author Sean A. Irvine
 */
public class A061118 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final StringBuilder sb = new StringBuilder();
    for (long k = mN & ~1; k > 0; k -= 2) {
      sb.append(k * k);
    }
    for (long k = 1; k <= mN; k += 2) {
      sb.append(k * k);
    }
    return new Z(sb);
  }
}
