package irvine.oeis.a329;
// Generated by gen_seq4.pl 2023-12-08b/moebiusx at 2023-12-08 23:30

import irvine.oeis.a122.A122111;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A329034 M\u00f6bius transform of A122111.
 * @author Georg Fischer
 */
public class A329034 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A329034() {
    super(new A122111(), 0);
    next();
  }
}
