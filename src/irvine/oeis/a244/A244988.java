package irvine.oeis.a244;
// Generated by gen_seq4.pl 2024-03-14g/simtraf at 2024-03-14 21:15

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A244988 a(n) = n - A244989(n).
 * @author Georg Fischer
 */
public class A244988 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A244988() {
    super(1, new A244989(), (n, v) -> Z.valueOf(n).subtract(v));
  }
}
