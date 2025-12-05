package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a081.A081291;

/**
 * A082327 Permutation of natural numbers induced by the contraction of Catalan bijection signature-permutation A082325.
 * @author Sean A. Irvine
 */
public class A082327 extends A081291 {

  private final DirectSequence mA082853 = DirectSequence.forceCreate(0, new A082853());
  private final DirectSequence mA082325 = DirectSequence.create(new A082325());

  @Override
  public Z next() {
    return mA082853.a(mA082325.a(super.next()));
  }
}
