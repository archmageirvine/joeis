package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017757 Binomial coefficients <code>C(n,93)</code>.
 * @author Sean A. Irvine
 */
public class A017757 implements Sequence {

  private long mN = 92;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 93);
  }
}

