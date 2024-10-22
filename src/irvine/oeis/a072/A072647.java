package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048679;

/**
 * A072647 a(n) = A072637(A048679(n)).
 * @author Sean A. Irvine
 */
public class A072647 extends A048679 {

  private final DirectSequence mA = new A072637();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
