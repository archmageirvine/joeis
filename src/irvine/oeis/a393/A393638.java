package irvine.oeis.a393;

import irvine.oeis.a343.A343060;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393638 Decimal expansion of 2/(1+cos(Pi/8))-1.
 * @author Sean A. Irvine
 */
public class A393638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393638() {
    super(0, new A343060().getCR().square());
  }
}
