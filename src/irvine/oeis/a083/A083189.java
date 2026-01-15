package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083189 Primes arising in A083188.
 * @author Sean A. Irvine
 */
public class A083189 extends Sequence1 {

  private int mN = 0;
  private final A083188 mSeq = new A083188();

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

