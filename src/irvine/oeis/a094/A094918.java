package irvine.oeis.a094;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094918 a(n) = (3^n-1)/2 mod n.
 * @author Georg Fischer
 */
public class A094918 extends LambdaSequence {

  /** Construct the sequence. */
  public A094918() {
    super(1, n -> Z.THREE.pow(n).subtract(1).divide(2).modZ(n));
  }
}
