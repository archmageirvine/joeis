package irvine.oeis.a060;

import irvine.oeis.PrependSequence;

/**
 * A060394 Values of k associated with A060392.
 * @author Sean A. Irvine
 */
public class A060394 extends PrependSequence {

  /** Construct the sequence. */
  public A060394() {
    super(1, new A060393().skip(2), 1, 1);
  }
}
