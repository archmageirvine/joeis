package irvine.oeis.a064;

import irvine.lisp.SExpression;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A064639 Positions of non-crossing fixed-point-free involutions encoded by A014486 (after reflection) in A055089. Permutation of A064640.
 * @author Sean A. Irvine
 */
public class A064639 extends A064638 {

  @Override
  protected IntegerPermutation noncrossingTranspose(final Z n) {
    return noncrossingTransposeAux(SExpression.binexp2pars(n).deepReverse(), 0);
  }
}
