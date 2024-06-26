package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.a174.A174574;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A343754 a(n) = 0, and for any n &gt; 0, a(n+1) = a(n) - A065363(n) + 1.
 * @author Georg Fischer
 */
public class A343754 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A343754() {
    super(0, new A174574(), (n, v) -> Z.valueOf(n).subtract(v));
  }
}
