package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063193 Engel expansion of Sum_{k&gt;=0} 1/(10 + k)^k.
 * @author Sean A. Irvine
 */
public class A063193 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063193() {
    super(new A098686(10).getCR());
  }
}
