package irvine.oeis.a089;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A089643 3^a(n) divides C(3n,n); 3-adic valuation of A005809.
 * a(n)=valuation(binomial(3*n,n), 3).
 * @author Georg Fischer
 */
public class A089643 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A089643() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.valuation(Z.THREE, Binomial.binomial(3 * mN, mN)));
  }
}
