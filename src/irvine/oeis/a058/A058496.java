package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a133.A133099;

/**
 * A058496 McKay-Thompson series of class 13B for the Monster group.
 * @author Sean A. Irvine
 */
public class A058496 extends PrependSequence {

  /** Construct the sequence. */
  public A058496() {
    super(new SkipSequence(new A133099(), 2), 1, 0);
  }
}
