package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048680;
import irvine.oeis.a054.A054238;

/**
 * A072793 Simple tabular N X N -&gt; N bijection: first interleave the bits as with A054238, then apply the bijection A048680.
 * @author Sean A. Irvine
 */
public class A072793 extends A054238 {

  private final DirectSequence mA048680 = new A048680();

  @Override
  public Z next() {
    return mA048680.a(super.next());
  }
}
