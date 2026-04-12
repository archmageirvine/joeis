package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061607 Ooguri-Vafa invariants of disk domain wall degeneracies for brane I in the O(K) -&gt; P^1 X P^1 geometry.
 * @author Sean A. Irvine
 */
public class A061607 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 16, 16)
      .add(Binomial.binomial(mN + 15, 16).multiply(53))
      .add(Binomial.binomial(mN + 14, 16).multiply(476))
      .add(Binomial.binomial(mN + 13, 16).multiply(1044))
      .add(Binomial.binomial(mN + 12, 16).multiply(476))
      .add(Binomial.binomial(mN + 11, 16).multiply(53))
      .add(Binomial.binomial(mN + 10, 16))
      .multiply(mN + 1);
  }
}
