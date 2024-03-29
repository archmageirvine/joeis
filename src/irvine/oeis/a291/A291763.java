package irvine.oeis.a291;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.z.Z;
import irvine.oeis.a245.A245612;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A291763 Binary encoding of 2-digits in ternary representation of A245612(n).
 * @author Georg Fischer
 */
public class A291763 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A291763() {
    super(0, new A245612(), v -> new Z(v.toString(3).replace('1', '0').replace('2', '1'), 2));
  }
}
