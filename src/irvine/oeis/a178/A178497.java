package irvine.oeis.a178;
// manually simgcd/simgcdp at 2023-08-14

import irvine.oeis.PrependSequence;
import irvine.oeis.a145.A145503;

/**
 * A178497 5 followed by A145503.
 * @author Georg Fischer
 */
public class A178497 extends PrependSequence {

  /** Construct the sequence. */
  public A178497() {
    super(0, new A145503(), 5);
  }
}
