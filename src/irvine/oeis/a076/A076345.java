package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000961;

/**
 * A076345 A076340(A000961(n)), real part of prime powers mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076345 extends A076340 {

  private final Sequence mA = new A000961();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
