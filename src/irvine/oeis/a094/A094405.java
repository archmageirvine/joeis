package irvine.oeis.a094;
// manually deris/essent at 2022-10-26 11:22

import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066910;

/**
 * A094405 a(1) = 1; a(n) = (sum of previous terms) mod n.
 * @author Georg Fischer
 */
public class A094405 extends PrependSequence {

  /** Construct the sequence. */
  public A094405() {
    super(2, new A066910(), 1);
  }
}
