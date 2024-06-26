package irvine.oeis.a317;
// Generated by gen_seq4.pl known4/simtraf at 2023-10-15 18:28

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A317946 Additive with a(p^e) = A011371(e); the 2-adic valuation of A317934(n).
 * @author Georg Fischer
 */
public class A317946 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A317946() {
    super(1, new A317934(), v -> Functions.VALUATION.z(v, Z.TWO));
  }
}
