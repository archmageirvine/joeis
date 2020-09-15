package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a205.A205826;

/**
 * A058612 McKay-Thompson series of class 30A for Monster.
 * @author Sean A. Irvine
 */
public class A058612 extends PrependSequence {

  /** Construct the sequence. */
  public A058612() {
    super(new SkipSequence(new A205826(), 2), 1, 0);
  }
}
