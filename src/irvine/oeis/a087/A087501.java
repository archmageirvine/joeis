package irvine.oeis.a087;

import irvine.oeis.a074.A074962;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A087501 Continued fraction expansion of the Glaisher-Kinkelin constant.
 * @author Sean A. Irvine
 */
public class A087501 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A087501() {
    super(new A074962());
  }
}
