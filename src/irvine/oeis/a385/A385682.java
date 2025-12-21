package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002088;

/**
 * A385682 a(n) = (n - 1) * Sum_{k=2..n} A000010(k).
 * @author Sean A. Irvine
 */
public class A385682 extends Sequence1 {

  private final Sequence mA = new A002088().skip();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.next().subtract(1).multiply(++mN);
  }
}
