package irvine.oeis.a063;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063184 Engel expansion of Sum_{k&gt;=0} 1/(1 + k)^k.
 * @author Sean A. Irvine
 */
public class A063184 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063184() {
    super(new A098686().getCR());
  }
}
