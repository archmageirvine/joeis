package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A076348 A076341(A005117(n)), imaginary part of squarefree numbers mapped as defined in A076340, A076341.
 * @author Sean A. Irvine
 */
public class A076348 extends A076341 {

  private final Sequence mA = new A005117();

  @Override
  public Z next() {
    return a(mA.next());
  }
}
