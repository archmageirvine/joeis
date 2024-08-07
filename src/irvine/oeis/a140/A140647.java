package irvine.oeis.a140;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A140647 Number of car parking assignments of n cars in n spaces, if one car does not park.
 * @author Georg Fischer
 */
public class A140647 extends LambdaSequence {

  /** Construct the sequence. */
  public A140647() {
    super(2, n -> Z.valueOf(n + 2).pow(n - 1).multiply(2).subtract(Z.valueOf(3L * n + 1).multiply(Z.valueOf(n + 1).pow(n - 2))));
  }
}
