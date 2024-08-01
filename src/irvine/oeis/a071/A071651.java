package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a061.A061579;

/**
 * A071651 Permutation of natural numbers induced by reranking plane binary trees given in the standard lexicographic order (A014486) with an "arithmetic global ranking algorithm", using the bivariate form of A061579 as the packing bijection N x N -&gt; N.
 * @author Sean A. Irvine
 */
public class A071651 extends Sequence0 {

  // todo this is not correct

  private final DirectSequence mA = DirectSequence.create(new A014486());
  private final Sequence mB = new A061579();

  @Override
  public Z next() {
    return mA.a(mB.next().intValueExact());
  }
}
