package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a271.A271703;

/**
 * A059110 Triangle T = A007318*A271703; T(n,m)= Sum_{i=0..n} L'(n,i)*binomial(i,m), m=0..n.
 * @author Sean A. Irvine
 */
public class A059110 extends A271703 {

  @Override
  protected Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, n, k -> super.t(n, k).multiply(Binomial.binomial(k, m)));
  }
}

