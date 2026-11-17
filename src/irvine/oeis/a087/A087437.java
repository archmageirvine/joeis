package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a025.A025487;
import irvine.oeis.a077.A077565;

/**
 * A087437 A077565 indexed by A025487.
 * @author Sean A. Irvine
 */
public class A087437 extends A025487 {

  private final DirectSequence mA = new A077565();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
