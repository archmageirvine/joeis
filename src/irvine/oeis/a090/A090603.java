package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A090603 Number of n-element labeled groupoids with a fixed identity.
 * @author Georg Fischer
 */
public class A090603 extends LambdaSequence {

  /** Construct the sequence. */
  public A090603() {
    super(1, n -> Z.valueOf(n).pow((long) (n - 1) * (n - 1)));
  }
}
