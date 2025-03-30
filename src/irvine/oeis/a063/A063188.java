package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063188 Engel expansion of Sum_{k&gt;=0} 1/(5 + k)^k.
 * @author Sean A. Irvine
 */
public class A063188 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A063188() {
    super(new A098686(5).getCR());
  }
}
