package irvine.oeis.a056;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001371;

/**
 * A056348 Number of primitive (period n) bracelets using exactly two different colored beads.
 * @author Georg Fischer
 */
public class A056348 extends PrependSequence {

  /** Construct the sequence. */
  public A056348() {
    super(1, new A001371().skip(2), 0);
  }
}
