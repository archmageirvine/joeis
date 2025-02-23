package irvine.oeis.a175;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 00:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A175297 Convert n to binary. AND each respective digit of binary n and binary A030101(n), where A030101(n) is the reversal of the order of the digits in the binary representation of n (given in decimal). a(n) is the decimal value of the result.
 * @author Georg Fischer
 */
public class A175297 extends LambdaSequence {

  /** Construct the sequence. */
  public A175297() {
    super(1, n -> Z.valueOf(n).and(Functions.REVERSE.z(2, n)));
  }
}
