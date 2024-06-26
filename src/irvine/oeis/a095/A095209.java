package irvine.oeis.a095;
// Generated by gen_seq4.pl 2024-06-21/simtraf at 2024-06-22 00:01

import irvine.oeis.a020.A020522;
import irvine.oeis.a057.A057335;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A095209 a(0) = 1, and for n &gt; 0, a(n) = the least multiple of prime(n) such that the geometric mean of a(0) to a(n) is an integer.
 * @author Georg Fischer
 */
public class A095209 extends SimpleTransformSequence {

  private static final MemorySequence A057335 = new A057335();

  /** Construct the sequence. */
  public A095209() {
    super(0, new A020522(), v -> A057335.a(v));
  }
}
