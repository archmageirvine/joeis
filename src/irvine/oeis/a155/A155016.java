package irvine.oeis.a155;
// Generated by gen_seq4.pl 2023-08-29/lambda at 2023-08-29 23:04

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A155016 Integer part of square root of A010801.
 * Integer part of square root of A010801.
 * @author Georg Fischer
 */
public class A155016 extends LambdaSequence {

  /** Construct the sequence. */
  public A155016() {
    super(0, n -> Z.valueOf(n).pow(13).sqrt());
  }
}
