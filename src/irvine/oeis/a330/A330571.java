package irvine.oeis.a330;
// Generated by gen_seq4.pl 2023-10-12/simtraf at 2023-10-12 23:13

import irvine.oeis.a038.A038548;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A330571 Square of number of unordered factorizations of n as n = i*j.
 * @author Georg Fischer
 */
public class A330571 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A330571() {
    super(1, new A038548(), v -> v.square());
  }
}
