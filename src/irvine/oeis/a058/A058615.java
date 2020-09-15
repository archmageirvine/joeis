package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a205.A205962;

/**
 * A058615 McKay-Thompson series of class 30D for Monster.
 * @author Sean A. Irvine
 */
public class A058615 extends PrependSequence {

  /** Construct the sequence. */
  public A058615() {
    super(new SkipSequence(new A205962(), 2), 1, 0);
  }
}
