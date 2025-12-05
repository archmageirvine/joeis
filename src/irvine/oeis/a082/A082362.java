package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;
import irvine.oeis.a081.A081291;

/**
 * A082362 Permutation of natural numbers induced by the contraction of Catalan bijection signature-permutation A082352.
 * @author Sean A. Irvine
 */
public class A082362 extends A081291 {

  private final DirectSequence mA014486 = DirectSequence.create(new A014486());
  private final DirectSequence mA082853 = DirectSequence.forceCreate(0, new A082853());

  @Override
  public Z next() {
    return mA082853.a(Functions.GLOBAL_CATALAN_RANK.z(A082352.s082352(SExpression.binexp2pars(mA014486.a(super.next()))).toZ()));
  }
}
