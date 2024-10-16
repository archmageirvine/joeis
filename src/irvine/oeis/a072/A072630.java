package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000149;

/**
 * A072607.
 * @author Sean A. Irvine
 */
public class A072630 extends Sequence1 {

  private final Sequence mA = new A000149().skip();

  @Override
  public Z next() {
    return mA.next().subtract(1).or(Z.ONE);
  }
}
