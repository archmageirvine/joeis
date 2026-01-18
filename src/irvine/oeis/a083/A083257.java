package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a018.A018252;
import irvine.oeis.a071.A071364;

/**
 * A083257 a(n) = A071364(n-th nonprime number) = A071364(A018252(n)).
 * @author Sean A. Irvine
 */
public class A083257 extends A018252 {

  private final DirectSequence mA = DirectSequence.create(new A071364());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

