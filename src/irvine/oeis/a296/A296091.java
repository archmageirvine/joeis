package irvine.oeis.a296;
// manually A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039653;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A296091 a(1) = 1 and for n &gt; 1, the least number with the same prime signature as sigma(n)-1.
 * @author Georg Fischer
 */
public class A296091 extends SimpleTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A296091() {
    super(1, new A039653().skip(), FactorUtils::leastPrimeSignature);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 1) ? Z.ONE : result;
  }

}

