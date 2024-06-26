package irvine.oeis.a121;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 15:09

import irvine.math.function.Functions;
import irvine.oeis.a000.A000292;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A121359 Greatest prime factor of pyramidal number A000292(n).
 * @author Georg Fischer
 */
public class A121359 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A121359() {
    super(2, new A000292(), v -> Functions.GPF.z(v));
    super.next();
    super.next();
  }
}
