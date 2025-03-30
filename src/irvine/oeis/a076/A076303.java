package irvine.oeis.a076;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a060.A060295;

/**
 * A059184
 * @author Sean A. Irvine
 */
public class A076303 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A076303() {
    super(500, new A060295().getCR().subtract(262537412640768743L));
  }
}
