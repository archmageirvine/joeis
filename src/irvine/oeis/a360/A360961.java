package irvine.oeis.a360;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A360961 Triangle T(m,n) read by rows: the number of homomorphisms of the complete graph on n vertices to the quasi-complete graph on m vertices, m&gt;=3, 3&lt;=n&lt;m.
 * @author Gregory Morse
 */
public class A360961 extends Sequence3 {
  private int mM = 3;
  private int mN = 2;

  @Override
  public Z next() {
    if (++mN >= mM) {
      ++mM;
      mN = 3;
    }
    return Functions.FACTORIAL.z(mN).multiply(Binomial.binomial(mM - 2, mN - 1).multiply2().add(Binomial.binomial(mM - 2, mN)));
  }
}
