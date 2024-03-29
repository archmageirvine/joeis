package irvine.oeis.a155;
// Generated by gen_seq4.pl 2023-08-29/lambda at 2023-08-29 23:04

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A155014 a(n) = floor(sqrt(n^7)).
 * a(n) = floor(sqrt(n^7)).
 * @author Georg Fischer
 */
public class A155014 extends LambdaSequence {

  /** Construct the sequence. */
  public A155014() {
    super(0, n -> Z.valueOf(n).pow(7).sqrt());
  }
}
