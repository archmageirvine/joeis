package irvine.oeis.a071;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a067.A067836;

/**
 * A071290 The sequence f(1), f(2), ... as defined in A067836.
 * @author Sean A. Irvine
 */
public class A071290 extends PartialProductSequence {

  /** Construct the sequence. */
  public A071290() {
    super(1, new PrependSequence(new A067836(), 1));
  }
}
