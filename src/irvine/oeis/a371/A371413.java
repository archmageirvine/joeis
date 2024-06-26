package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-05-24/simtraf at 2024-05-24 21:50

import irvine.math.function.Functions;
import irvine.oeis.a036.A036966;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A371413 Dedekind psi function applied to the cubefull numbers (A036966).
 * @author Georg Fischer
 */
public class A371413 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A371413() {
    super(1, new A036966(), v -> Functions.DEDEKIND_PSI.z(v));
  }
}
