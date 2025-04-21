package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007088;

/**
 * A360372 Numbers k &gt;= 1 such that k divides Sum_{i=1..k} A007088(i).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A360372 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;
  private final Sequence mA = new A007088().skip();

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(mA.next());
      if (mSum.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
