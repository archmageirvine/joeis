package irvine.oeis.a103;
// Generated by gen_seq4.pl 2024-06-01/lambdan at 2024-06-01 22:47

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A103723 Column m=6 sequence of triangle A103718(n,m), n&gt;=0.
 * @author Georg Fischer
 */
public class A103723 extends LambdaSequence {

  /** Construct the sequence. */
  public A103723() {
    super(0, n -> Functions.STIRLING1.z(n + 7, 7).abs().add(Functions.STIRLING1.z(n + 7, 8).abs()));
  }
}
