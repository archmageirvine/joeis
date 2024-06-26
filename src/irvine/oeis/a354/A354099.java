package irvine.oeis.a354;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A354099 The 3-adic valuation of Euler totient function phi.
 * @author Georg Fischer
 */
public class A354099 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A354099() {
    super(1, new A000010(), v -> Functions.VALUATION.z(v, Z.THREE));
  }
}
