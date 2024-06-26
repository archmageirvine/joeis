package irvine.oeis.a094;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094922 a(n) = (7^n-1)/6 mod n.
 * @author Georg Fischer
 */
public class A094922 extends LambdaSequence {

  /** Construct the sequence. */
  public A094922() {
    super(1, n -> Z.SEVEN.pow(n).subtract(1).divide(6).modZ(n));
  }
}
