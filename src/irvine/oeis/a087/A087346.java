package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a088.A088116;

/**
 * A087346 a(n) = A088116(100+n).
 * @author Sean A. Irvine
 */
public class A087346 extends Sequence1 {

  private final DirectSequence mA = new A088116();
  private long mN = 100;

  @Override
  public Z next() {
    return mA.a(++mN);
  }
}
