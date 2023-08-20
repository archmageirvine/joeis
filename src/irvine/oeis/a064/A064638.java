package irvine.oeis.a064;

import irvine.lisp.SExpression;
import irvine.math.IntegerUtils;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A064638 Positions of non-crossing fixed-point-free involutions encoded by A014486 in A055089. Permutation of A064640.
 * @author Sean A. Irvine
 */
public class A064638 extends A014486 {

  protected IntegerPermutation noncrossingTransposeAux(final SExpression s, int i) {
    IntegerPermutation p = new IntegerPermutation();
    for (final SExpression e : s) {
      p = p.compose(noncrossingTransposeAux(e, i + 1));
      final int j = i + e.countParens() + 1;
      final int[] t = new int[j + 1];
      IntegerUtils.identity(t);
      t[i] = j;
      t[j] = i;
      p = p.compose(new IntegerPermutation(t));
      i = j + 1;
    }
    return p;
  }

  protected IntegerPermutation noncrossingTranspose(final Z n) {
    return noncrossingTransposeAux(SExpression.binexp2pars(n), 0);
  }

  @Override
  public Z next() {
    return noncrossingTranspose(super.next()).permRevLexRank();
  }
}
