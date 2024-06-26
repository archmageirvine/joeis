package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-05-09/simtraf at 2024-05-09 22:36

import irvine.oeis.a057.A057716;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A274089 Numbers repeated except that powers of 2 only appear once.
 * @author Georg Fischer
 */
public class A274089 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A274089() {
    super(1, new A057716().skip(1), v -> v.divide(2));
  }
}
