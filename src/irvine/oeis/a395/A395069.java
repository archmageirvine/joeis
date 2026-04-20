package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002326;

/**
 * A395069 allocated for Fabio Longo.
 * @author Sean A. Irvine
 */
public class A395069 extends Sequence1 {

  private final Sequence mA = new A002326().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.next().multiply(++mN);
  }
}
