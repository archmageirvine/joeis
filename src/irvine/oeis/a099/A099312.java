package irvine.oeis.a099;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007416;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A099312 Exponent of greatest power of 2 dividing the n-th minimal number.
 * @author Georg Fischer
 */
public class A099312 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A099312() {
    super(1, new A007416(), v -> Functions.VALUATION.z(v, Z.TWO));
  }
}
