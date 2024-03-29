package irvine.oeis.a304;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.z.Z;
import irvine.oeis.a254.A254103;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A304760 Binary encoding of 1-digits in ternary representation of A254103(n).
 * @author Georg Fischer
 */
public class A304760 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A304760() {
    super(0, new A254103(), v -> new Z(v.toString(3).replace('2', '0'), 2));
  }
}
