package irvine.oeis.a364;
// Generated by gen_seq4.pl 2023-12-08b/moebiusx at 2023-12-08 23:30

import irvine.oeis.a005.A005941;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A364557 M\u00f6bius transform of A005941.
 * @author Georg Fischer
 */
public class A364557 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A364557() {
    super(new A005941(), 0);
    next();
  }
}
