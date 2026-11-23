package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a344.A344005;

/**
 * A345995 Numbers k such that A345992(k) &gt; A345993(k).
 * @author Sean A. Irvine
 */
public class A345995 extends Sequence1 {

  private final Sequence mA = new A345992();
  private final Sequence mB = new A344005() {
    private long mN = 1;

    @Override
    public Z next() {
      return super.next().gcd(++mN);
    }
  };
  private long mN;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
