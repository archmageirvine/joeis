package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048679;
import irvine.oeis.a059.A059906;

/**
 * A072662 Composition of the A059906 and A048679, i.e., a(n) = A059906(A048679(n)).
 * @author Sean A. Irvine
 */
public class A072662 extends A048679 {

  private final DirectSequence mA059906 = new A059906();

  @Override
  public Z next() {
    return mA059906.a(super.next());
  }
}
