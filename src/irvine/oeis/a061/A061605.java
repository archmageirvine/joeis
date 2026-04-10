package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061605 Ooguri-Vafa invariants of disk domain wall degeneracies for brane I in the O(K) -&gt; P^1 X P^1 geometry.
 * @author Sean A. Irvine
 */
public class A061605 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 8, 8)
      .add(Binomial.binomial(mN + 7, 8).multiply(6))
      .add(Binomial.binomial(mN + 6, 8))
      .multiply(mN + 1);
  }
}
