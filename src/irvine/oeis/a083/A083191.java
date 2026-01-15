package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083191 Composite numbers arising in A083190.
 * @author Sean A. Irvine
 */
public class A083191 extends Sequence1 {

  private int mN = 0;
  private final A083190 mSeq = new A083190();

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = mN; k < 2 * mN; ++k) {
      sb.append(mSeq.a(k));
    }
    return new Z(sb);
  }
}

