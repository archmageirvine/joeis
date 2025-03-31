package irvine.oeis.a076;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a060.A060295;

/**
 * A076303 Engel expansion of exp(Pi * sqrt(163)) - 262537412640768743.
 * @author Sean A. Irvine
 */
public class A076303 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A076303() {
    super(500, new A060295().getCR().subtract(262537412640768743L));
  }
}
