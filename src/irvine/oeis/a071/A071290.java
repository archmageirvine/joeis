package irvine.oeis.a071;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a067.A067836;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071290 extends PartialProductSequence {

  /** Construct the sequence. */
  public A071290() {
    super(new PrependSequence(new A067836(), 1));
  }
}
