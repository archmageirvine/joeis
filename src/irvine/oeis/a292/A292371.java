package irvine.oeis.a292;
// Generated by gen_seq4.pl 2024-01-16/lambdan at 2024-01-19 19:57

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A292371 A binary encoding of 1-digits in the base-4 representation of n.
 * @author Georg Fischer
 */
public class A292371 extends LambdaSequence {

  /** Construct the sequence. */
  public A292371() {
    super(0, n -> new Z(Integer.toString(n, 4).replaceAll("[23]", "0"), 2));
  }
}
