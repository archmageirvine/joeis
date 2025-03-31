package irvine.oeis.a063;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063186 Engel expansion of Sum_{k&gt;=0} 1/(3 + k)^k.
 * @author Sean A. Irvine
 */
public class A063186 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063186() {
    super(new A098686(3).getCR());
  }
}
