package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000849;
import irvine.oeis.a005.A005867;

/**
 * A066264 Number of composites &lt; primorial(p) with all prime factors &gt; p.
 * @author Sean A. Irvine
 */
public class A066264 extends Sequence1 {

  private final Sequence mA = new A005867().skip();
  private final Sequence mB = new A000849().skip();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).add(++mN);
  }
}
