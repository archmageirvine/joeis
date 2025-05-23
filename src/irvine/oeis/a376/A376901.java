package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-17.ack/lambdan at 2024-10-17 21:06

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A376901 a(n) = (n*(n-1)+(-1)^n+5)/2.
 * @author Georg Fischer
 */
public class A376901 extends LambdaSequence {

  /** Construct the sequence. */
  public A376901() {
    super(0, n -> Z.valueOf(n).multiply(n - 1).add(Z.NEG_ONE.pow(n)).add(5).divide(2));
  }
}
