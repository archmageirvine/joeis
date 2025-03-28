package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A076266 Largest k such that A005132(n+2*i) = A005132(n) - i for any 0&lt;=i&lt;=k.
 * @author Sean A. Irvine
 */
public class A076266 extends Sequence1 {

  private final DirectSequence mRecaman = DirectSequence.create(new A005132());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (mRecaman.a(mN + 2 * ++k).equals(mRecaman.a(mN).subtract(k))) {
      // do nothing
    }
    return Z.valueOf(k - 1);
  }
}
