package irvine.oeis.a154;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056911;

/**
 * A154430 Odd squarefree numbers n such that the cyclotomic polynomial Phi(n,x) has height &gt; 1.
 * @author Georg Fischer
 */
public class A154430 extends FilterSequence {

  /** Construct the sequence. */
  public A154430() {
    super(1, new A056911(), t -> PolynomialUtils.height(CyclotomicPolynomials.cyclotomic(t.intValue())).compareTo(Z.ONE) > 0);
  }

}
