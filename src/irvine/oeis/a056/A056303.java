package irvine.oeis.a056;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000048;

/**
 * A056303 Number of primitive (period n) n-bead necklace structures using exactly two different colored beads.
 * @author Georg Fischer
 */
public class A056303 extends PrependSequence {

  /** Construct the sequence. */
  public A056303() {
    super(new A000048().skip(2), 0);
  }
}
