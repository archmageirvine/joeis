package irvine.oeis.a111;
// Generated by gen_seq4.pl 2023-09-25/lambda at 2023-09-28 18:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A111393 Number of digits in n^3.
 * @author Georg Fischer
 */
public class A111393 extends LambdaSequence {

  /** Construct the sequence. */
  public A111393() {
    super(1, n -> Z.valueOf(Z.valueOf(n).pow(3).toString().length()));
  }
}
