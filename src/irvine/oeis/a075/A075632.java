package irvine.oeis.a075;

import irvine.oeis.PrependSequence;
import irvine.oeis.SelfQuotientSequence;

/**
 * A075616.
 * @author Sean A. Irvine
 */
public class A075632 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A075632() {
    super(1, new PrependSequence(new A075631(), 1));
  }
}
