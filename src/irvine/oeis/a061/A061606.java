package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061606 Ooguri-Vafa invariants of disk domain wall degeneracies for brane I in the O(K) -&gt; P^1 X P^1 geometry.
 * @author Sean A. Irvine
 */
public class A061606 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 12, 12)
      .add(Binomial.binomial(mN + 11, 12).multiply(22))
      .add(Binomial.binomial(mN + 10, 12).multiply(67))
      .add(Binomial.binomial(mN + 9, 12).multiply(22))
      .add(Binomial.binomial(mN + 8, 12))
      .multiply(mN + 1);
  }
}
