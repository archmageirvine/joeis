package irvine.oeis.a063;

import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063192 Engel expansion of Sum_{k&gt;=0} 1/(9 + k)^k.
 * @author Sean A. Irvine
 */
public class A063192 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063192() {
    super(new A098686(9).getCR());
  }
}
