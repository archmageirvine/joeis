package irvine.oeis.a059;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059928 The periodic point counting sequence for the toral automorphism given by the polynomial of (conjectural) smallest Mahler measure. The map is x -&gt; Ax mod 1 for x in [0,1)^10, where A is the companion matrix for the polynomial x^10+x^9-x^7-x^6-x^5-x^4-x^3+x+1.
 * @author Sean A. Irvine
 */
public class A059928 extends Sequence1 {

  private static final MatrixField<Q> FLD = new MatrixField<>(10, Rationals.SINGLETON);
  private static final DefaultMatrix<Q> M = new DefaultMatrix<>(
    new Q[][] {
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.NEG_ONE},
      {Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.NEG_ONE},
      {Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO},
      {Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO, Q.ONE},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.ZERO, Q.ZERO},
      {Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ZERO, Q.ONE, Q.NEG_ONE},
    }, Q.ZERO);
  private int mN = 0;

  @Override
  public Z next() {
    return FLD.det(FLD.subtract(FLD.pow(M, ++mN), FLD.one())).abs().toZ();
  }
}
