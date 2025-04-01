package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;

/**
 * A076349 A076340(A000290(n)), real part of squares mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076349 extends A076340 {

  private final Sequence mA = new A000290().skip();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
