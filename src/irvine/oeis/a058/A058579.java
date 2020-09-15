package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a138.A138688;

/**
 * A058579 McKay-Thompson series of class 24I for Monster.
 * @author Sean A. Irvine
 */
public class A058579 extends PrependSequence {

  /** Construct the sequence. */
  public A058579() {
    super(new SkipSequence(new A138688(), 2), 1, 0);
  }
}
