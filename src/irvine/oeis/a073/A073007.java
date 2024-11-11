package irvine.oeis.a073;

import irvine.oeis.a072.A072558;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073007 Decimal expansion of Varga's constant.
 * @author Sean A. Irvine
 */
public class A073007 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073007() {
    super(1, new A072558().getCR().inverse());
  }
}
