package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005361;

/**
 * A082091 a(n) = one more than the number of iterations of A005361 needed to reach 1 from the starting value n.
 * @author Sean A. Irvine
 */
public class A082091 extends Sequence1 {

  private final DirectSequence mA = new A005361();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 1;
    while (!t.isOne()) {
      ++cnt;
      t = mA.a(t);
    }
    return Z.valueOf(cnt);
  }
}
