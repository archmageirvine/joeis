package irvine.oeis.a081;

import irvine.oeis.a079.A079555;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081845 Decimal expansion of Product_{k&gt;=0} (1 + 1/2^k).
 * @author Sean A. Irvine
 */
public class A081845 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081845() {
    super(1, new A079555().getCR().multiply(2));
  }
}
