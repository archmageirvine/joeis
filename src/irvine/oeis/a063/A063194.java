package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063194 Engel expansion of 1 + Sum_{k&gt;=1} 1/k^k.
 * @author Sean A. Irvine
 */
public class A063194 extends EngelExpansionSequence {

  @Override
  protected CR getN() {
    return new A098686(0).getCR();
  }
}
