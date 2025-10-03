package irvine.oeis.a080;

import irvine.oeis.a055.A055060;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080890 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A080890() {
    super(0, new A055060());
  }
}

