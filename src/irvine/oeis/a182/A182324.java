package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.a000.A000030;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A182324 n + (initial digit of n) in decimal representation.
 * @author Georg Fischer
 */
public class A182324 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A182324() {
    super(0, new A000030(), (n, v) -> Z.valueOf(n).add(v));
  }
}
