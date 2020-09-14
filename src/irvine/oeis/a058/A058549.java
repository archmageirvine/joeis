package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a136.A136569;

/**
 * A058549 McKay-Thompson series of class 19A for Monster.
 * @author Sean A. Irvine
 */
public class A058549 extends PrependSequence {

  /** Construct the sequence. */
  public A058549() {
    super(new SkipSequence(new A136569(), 2), 1, 0);
  }
}
