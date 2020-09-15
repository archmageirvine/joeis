package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a205.A205977;

/**
 * A058617 McKay-Thompson series of class 30F for Monster.
 * @author Sean A. Irvine
 */
public class A058617 extends PrependSequence {

  /** Construct the sequence. */
  public A058617() {
    super(new SkipSequence(new A205977(), 2), 1, 0);
  }
}
