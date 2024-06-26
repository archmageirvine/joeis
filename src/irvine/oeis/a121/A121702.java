package irvine.oeis.a121;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A121702 a(n)=2^(n^3-1).
 * @author Georg Fischer
 */
public class A121702 extends LambdaSequence {

  /** Construct the sequence. */
  public A121702() {
    super(1, n -> Z.TWO.pow(Z.valueOf(n).pow(3).subtract(1)));
  }
}
