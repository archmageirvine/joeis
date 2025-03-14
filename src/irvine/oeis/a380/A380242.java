package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380242 Number of rooted 6-regular planar maps with n vertices.
 * @author Georg Fischer
 */
public class A380242 extends LambdaSequence {

  /** Construct the sequence. */
  public A380242() {
    super(0, n -> Z.TWO.multiply(Z.TEN.pow(n)).multiply(Functions.FACTORIAL.z(3 * n)).divide(Functions.FACTORIAL.z(n).multiply(Functions.FACTORIAL.z(2 * n + 2))));
  }
}
