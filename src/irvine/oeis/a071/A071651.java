package irvine.oeis.a071;

import java.util.function.BiFunction;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;

/**
 * A071651 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using the bivariate form of A061579 as the packing bijection N x N -&gt; N.
 * @author Sean A. Irvine
 */
public class A071651 extends Sequence0 {

  private final Sequence mA = new A014486();
  private final BiFunction<Z, Z, Z> mLambda;

  protected A071651(final BiFunction<Z, Z, Z> lambda) {
    mLambda = lambda;
  }

  /** Construct the sequence. */
  public A071651() {
    this((x, y) -> x.add(y).square().add(x.multiply(3)).add(y).divide2());
  }

  private Z rankBinTree(final SExpression s, final BiFunction<Z, Z, Z> lambda) {
    if (s.isEmpty()) {
      return Z.ZERO;
    }
    return Z.ONE.add(lambda.apply(rankBinTree(s.car(), lambda), rankBinTree(s.cdr(), lambda)));
  }

  private Z arithrankBijection(final Z tree, final BiFunction<Z, Z, Z> lambda) {
    return rankBinTree(SExpression.binexp2pars(tree), lambda);
  }

  @Override
  public Z next() {
    return arithrankBijection(mA.next(), mLambda);
  }
}
