package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002262;

/**
 * A072555.
 * @author Sean A. Irvine
 */
public class A072741 extends A072735 {

  private final DirectSequence mA002262 = new A002262();

  @Override
  public Z next() {
    return mA002262.a(super.next());
  }
}
