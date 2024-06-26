package irvine.oeis.a125;
// Generated by gen_seq4.pl 2023-09-25/lambda at 2023-09-28 18:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A125059 Number of digits in n!!.
 * @author Georg Fischer
 */
public class A125059 extends LambdaSequence {

  /** Construct the sequence. */
  public A125059() {
    super(0, n -> Z.valueOf(Functions.MULTIFACTORIAL.z(n).toString().length()));
  }
}
