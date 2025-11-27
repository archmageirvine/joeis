package irvine.oeis.a089;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A089893 a(n) = (A001317(2n)-1)/4.
 * @author Georg Fischer
 */
public class A089893 extends LambdaSequence {

  /** Construct the sequence. */
  public A089893() {
    super(0, n -> Integers.SINGLETON.sum(0, 2 * n + 1, k -> Z.valueOf(Binomial.binomial(2L * n + 1, k, 2)).shiftLeft(k)).subtract(Z.THREE).divide(Z.valueOf(12)));
  }
}
