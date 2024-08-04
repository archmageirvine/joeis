package irvine.oeis.a071;

import java.util.function.Function;

import irvine.lisp.SExpression;
import irvine.math.cr.CR;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057120;

/**
 * A071652 Inverse permutation to A071651.
 * @author Sean A. Irvine
 */
public class A071652 extends Sequence0 {

  protected final Function<Z, Z> mLambda1;
  protected final Function<Z, Z> mLambda2;
  private Z mN = Z.NEG_ONE;

  protected A071652(final Function<Z, Z> lambda1, final Function<Z, Z> lambda2) {
    mLambda1 = lambda1;
    mLambda2 = lambda2;
  }

  /** Construct the sequence. */
  public A071652() {
    this(n -> n.subtract(Binomial.binomial(CR.valueOf(n.add(1).multiply2()).sqrt().add(CR.HALF).floor(), 2)),
      n -> Binomial.binomial(CR.valueOf(n.add(1).multiply2()).sqrt().add(CR.HALF).floor().add(1), 2).subtract(n.add(1)));
  }

  protected SExpression unrankBinTree(final Z rank, final Function<Z, Z> lambda1, final Function<Z, Z> lambda2) {
    if (rank.isZero()) {
      return new SExpression();
    }
    final Z r1 = rank.subtract(1);
    return SExpression.createTree(unrankBinTree(lambda1.apply(r1), lambda1, lambda2), unrankBinTree(lambda2.apply(r1), lambda1, lambda2));
  }

  private Z arithrankBijection(final Z n, final Function<Z, Z> lambda1, final Function<Z, Z> lambda2) {
    return A057120.catalanGlobalRank(unrankBinTree(n, lambda1, lambda2).toZ());
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return arithrankBijection(mN, mLambda1, mLambda2);
  }
}
