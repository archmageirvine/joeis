package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a025.A025581;

/**
 * A072781 X-projection of the tabular N X N -&gt; N bijection A072735.
 * @author Sean A. Irvine
 */
public class A072781 extends A072734 {

  private final DirectSequence mA025581 = new A025581();

  @Override
  public Z next() {
    return mA025581.a(super.next());
  }
}
