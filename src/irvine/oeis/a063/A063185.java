package irvine.oeis.a063;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063185 Engel expansion of Sum_{k&gt;=0} 1/(2 + k)^k.
 * @author Sean A. Irvine
 */
public class A063185 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063185() {
    super(new A098686(2).getCR());
  }
}
