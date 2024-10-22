package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048679;
import irvine.oeis.a059.A059905;

/**
 * A072661 Composition of the A059905 and A048679, i.e., a(n) = A059905(A048679(n)).
 * @author Sean A. Irvine
 */
public class A072661 extends A048679 {

  private final DirectSequence mA059905 = new A059905();

  @Override
  public Z next() {
    return mA059905.a(super.next());
  }
}
