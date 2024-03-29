package irvine.oeis.a115;
// Generated by gen_seq4.pl 2023-10-14/lambdan at 2023-10-14 19:15

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A115639 First column of divide-and-conquer triangle A115636.
 * @author Georg Fischer
 */
public class A115639 extends LambdaSequence {

  /** Construct the sequence. */
  public A115639() {
    super(0, n -> Z.FOUR.pow(IntegerUtils.floorLog2(n + 2) - 1));
  }
}
