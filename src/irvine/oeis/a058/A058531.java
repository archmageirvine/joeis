package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a093.A093073;

/**
 * A058531 McKay-Thompson series of class 18A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058531 extends PrependSequence {

  /** Construct the sequence. */
  public A058531() {
    super(new SkipSequence(new A093073(), 2), 1, 0);
  }
}
