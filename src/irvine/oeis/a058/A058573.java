package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a184.A184990;

/**
 * A058573 McKay-Thompson series of class 24C for Monster.
 * @author Sean A. Irvine
 */
public class A058573 extends PrependSequence {

  /** Construct the sequence. */
  public A058573() {
    super(new SkipSequence(new A184990(), 2), 1, 0);
  }
}
