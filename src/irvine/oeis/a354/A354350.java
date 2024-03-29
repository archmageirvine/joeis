package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-03-14g/simtraf at 2024-03-14 21:15

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A354350 a(n) = n + A354365(n).
 * @author Georg Fischer
 */
public class A354350 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A354350() {
    super(1, new A354365(), (n, v) -> Z.valueOf(n).add(v));
  }
}
