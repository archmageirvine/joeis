package irvine.oeis.a163;
// Generated by gen_seq4.pl 2023-10-12/simtraf at 2023-10-12 23:13

import irvine.oeis.a228.A228351;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A163510 Irregular table read by rows: Write n in binary. For each 1, the m-th term of row n is the number of 0's between the m-th 1, reading right to left, and the (m-1)th 1 (or the right side of the number if m-1 = 0).
 * @author Georg Fischer
 */
public class A163510 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A163510() {
    super(1, new A228351(), v -> v.subtract(1));
  }
}
