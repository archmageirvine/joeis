package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056911;
import irvine.oeis.a160.A160338;

/**
 * A154430 Odd squarefree numbers n such that the cyclotomic polynomial Phi(n,x) has height &gt; 1.
 * @author Georg Fischer
 */
public class A154430 extends FilterSequence {

  /** Construct the sequence. */
  public A154430() {
    super(1, new A056911(), t -> A160338.height(Cyclotomic.cyclotomic(t.intValue())).compareTo(Z.ONE) > 0);
  }

}
