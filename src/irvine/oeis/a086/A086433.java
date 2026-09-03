package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a081.A081291;
import irvine.oeis.a082.A082853;
import irvine.oeis.a085.A085169;

/**
 * A086433 Contraction-permutation of A085169: a(n) = A082853(A085169(A081291(n))).
 * @author Sean A. Irvine
 */
public class A086433 extends A081291 {

  private final DirectSequence mA = DirectSequence.forceCreate(0, new A082853());
  private final DirectSequence mC = DirectSequence.create(new A085169());

  @Override
  public Z next() {
    return mA.a(mC.a(super.next()));
  }
}

