package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083193 a(1) = 1 and then primes arising in A083192. Concatenation of n-th term to (2n-1)-th term of A083192.
 * @author Sean A. Irvine
 */
public class A083193 extends Sequence1 {

  private int mN = 0;
  private final A083192 mSeq = new A083192();

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

