package irvine.oeis.a268;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.z.Z;
import irvine.oeis.a069.A069010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A268411 Parity of number of runs of 1's in binary representation of n.
 * @author Georg Fischer
 */
public class A268411 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A268411() {
    super(0, new A069010(), v -> v.testBit(0) ? Z.ONE : Z.ZERO);
  }
}
