package irvine.oeis.a130;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001623;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A130077 Largest x such that 2^x divides A001623(n), the number of reduced three-line Latin rectangles.
 * @author Georg Fischer
 */
public class A130077 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A130077() {
    super(3, new A001623(), v -> Functions.VALUATION.z(v, Z.TWO));
  }
}
