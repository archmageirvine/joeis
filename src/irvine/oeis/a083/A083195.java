package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a075.A075618;

/**
 * A083195 Multiples of n obtained as the concatenation of terms A075618(n) to A075618(2n-1).
 * @author Sean A. Irvine
 */
public class A083195 extends Sequence1 {

  private int mN = 0;
  private final DirectSequence mSeq = DirectSequence.create(new A075618());

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

