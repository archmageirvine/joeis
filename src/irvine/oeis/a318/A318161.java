package irvine.oeis.a318;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a180.A180281;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A318161 Number of compositions of 2n into exactly 2n nonnegative parts with largest part n.
 * @author Georg Fischer
 */
public class A318161 extends LambdaSequence {

  private static final BaseTriangle A180281 = new A180281();

  /** Construct the sequence. */
  public A318161() {
    super(0, n -> (n <= 0) ? Z.ONE : A180281.triangleElement(2 * n, n));
  }
}
