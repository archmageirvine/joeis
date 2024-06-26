package irvine.oeis.a286;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.function.Functions;
import irvine.oeis.a254.A254103;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A286632 Base-3 digit sum of A254103: a(n) = A053735(A254103(n)).
 * @author Georg Fischer
 */
public class A286632 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A286632() {
    super(0, new A254103(), v -> Functions.DIGIT_SUM.z(3, v));
  }
}
