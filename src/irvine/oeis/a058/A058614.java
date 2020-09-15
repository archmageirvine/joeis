package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a132.A132321;

/**
 * A058614 McKay-Thompson series of class 30C for Monster.
 * @author Sean A. Irvine
 */
public class A058614 extends PrependSequence {

  /** Construct the sequence. */
  public A058614() {
    super(new SkipSequence(new A132321(), 2), 1, 0);
  }
}
