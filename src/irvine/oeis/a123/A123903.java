package irvine.oeis.a123;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A123903 Total number of "Emperors" in all tournaments on n labeled nodes.
 * @author Georg Fischer
 */
public class A123903 extends LambdaSequence {

  /** Construct the sequence. */
  public A123903() {
    super(0, n -> Z.valueOf(n).multiply(Z.TWO.pow((long) (n - 1) * (n - 2) / 2)));
  }
}
