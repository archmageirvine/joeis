package irvine.oeis.a069;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A069767 Signature-permutation of Catalan bijection "Knick".
 * @author Sean A. Irvine
 */
public class A069767 extends A014486 {

  private final int mFolds;

  protected A069767(final int folds) {
    mFolds = folds;
  }

  /** Construct the sequence. */
  public A069767() {
    this(1);
  }

  @Override
  public Z next() {
    SExpression s = SExpression.binexp2pars(super.next());
    for (int k = 0; k < mFolds; ++k) {
      s = s.knick();
    }
    return A057120.catalanGlobalRank(s.toZ());
  }
}
