package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-04-22/simtraf at 2024-04-22 22:28

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A130380 Catalan numbers halved and rounded to the next integer.
 * @author Georg Fischer
 */
public class A130380 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A130380() {
    super(0, new A000108(), v -> v.testBit(0) ? v.add(1).divide(2) : v.divide(2));
  }
}
