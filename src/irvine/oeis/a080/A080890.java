package irvine.oeis.a080;

import irvine.oeis.a055.A055060;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A080890 Continued-fraction expansion of Komornik-Loreti constant.
 * @author Sean A. Irvine
 */
public class A080890 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A080890() {
    super(0, new A055060());
  }
}

