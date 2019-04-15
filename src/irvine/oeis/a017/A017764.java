package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017764 <code>a(n) =</code> binomial coefficient <code>C(n,100)</code>.
 * @author Sean A. Irvine
 */
public class A017764 implements Sequence {

  private long mN = 99;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 100);
  }
}

