package irvine.oeis.a280;
// manually A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.a283.A283475;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A280705 a(n) = A002110(A280700(n)) = A046523(A283475(n)).
 * @author Georg Fischer
 */
public class A280705 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A280705() {
    super(0, new A283475(), FactorUtils::leastPrimeSignature);
  }
}
