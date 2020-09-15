package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a212.A212253;

/**
 * A058641 McKay-Thompson series of class 35B for Monster.
 * @author Sean A. Irvine
 */
public class A058641 extends PrependSequence {

  /** Construct the sequence. */
  public A058641() {
    super(new SkipSequence(new A212253(), 2), 1, 0);
  }
}
