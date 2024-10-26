package irvine.oeis.a072;

import irvine.oeis.Combiner;
import irvine.oeis.a071.A071673;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072769 extends Combiner {

  /** Construct the sequence. */
  public A072769() {
    super(1, new A071673().skip(), new A072768(), SUBTRACT);
  }
}
