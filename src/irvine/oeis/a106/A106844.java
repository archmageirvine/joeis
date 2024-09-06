package irvine.oeis.a106;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a093.A093641;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A106844 Exponent of 2 in the prime factorization of A093641(n).
 * @author Georg Fischer
 */
public class A106844 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A106844() {
    super(1, new A093641(), v -> Functions.VALUATION.z(v, Z.TWO));
  }
}
