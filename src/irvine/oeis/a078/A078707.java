package irvine.oeis.a078;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A078707 Number of vectors of length n that are symmetric about the middle, where each element is drawn from a set of n distinct elements.
 * @author Georg Fischer
 */
public class A078707 extends LambdaSequence {

  /** Construct the sequence. */
  public A078707() {
    super(0, n -> Z.valueOf(n).pow((n + 1) / 2));
  }
}
