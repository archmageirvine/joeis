package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;
import irvine.oeis.a065.A065560;

/**
 * A081725 A065560(n) + n - prime(n).
 * @author Sean A. Irvine
 */
public class A081725 extends Sequence2 {

  private final Sequence mA = new A065560();
  private final Sequence mP = new A000040().skip();
  private long mN = 1;

  @Override
  public Z next() {
    return mA.next().add(++mN).subtract(mP.next());
  }
}
