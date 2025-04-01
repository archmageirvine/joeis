package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000290;

/**
 * A076350 A076341(A000290(n)), imaginary part of squares mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076350 extends A076341 {

  private final Sequence mA = new A000290().skip();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
