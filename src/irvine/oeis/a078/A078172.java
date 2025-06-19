package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a051.A051201;

/**
 * A078172 a(n) = A051201(A000040(n)).
 * @author Sean A. Irvine
 */
public class A078172 extends A000040 {

  private final DirectSequence mS = new A051201();

  @Override
  public Z next() {
    return mS.a(super.next());
  }
}
