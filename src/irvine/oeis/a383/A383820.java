package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383820 Decimal expansion of Sum_{k&gt;=1} 1/3^(3^k).
 * @author Sean A. Irvine
 */
public class A383820 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383820() {
    super(0, new A383817().getCR().subtract(CR.ONE_THIRD));
  }
}

