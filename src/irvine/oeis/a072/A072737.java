package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002262;

/**
 * A072737 Y-projection of the tabular N X N -&gt; N bijection A072732.
 * @author Sean A. Irvine
 */
public class A072737 extends A072733 {

  private final DirectSequence mA002262 = new A002262();

  @Override
  public Z next() {
    return mA002262.a(super.next());
  }
}
