package irvine.oeis.a069;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A069768 Signature-permutation of Catalan bijection "Knack".
 * @author Sean A. Irvine
 */
public class A069768 extends A014486 {

  private final int mFolds;

  protected A069768(final int folds) {
    mFolds = folds;
  }

  /** Construct the sequence. */
  public A069768() {
    this(1);
  }

  @Override
  public Z next() {
    SExpression s = SExpression.binexp2pars(super.next());
    for (int k = 0; k < mFolds; ++k) {
      s = s.knack();
    }
    return Functions.GLOBAL_CATALAN_RANK.z(s.toZ());
  }
}
