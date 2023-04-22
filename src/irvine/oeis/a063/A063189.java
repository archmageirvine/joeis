package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;
import irvine.oeis.a098.A098686;

/**
 * A063189 Engel expansion of Sum_{k&gt;=0} 1/(6 + k)^k.
 * @author Sean A. Irvine
 */
public class A063189 extends EngelExpansionSequence {

  @Override
  protected CR getN() {
    return new A098686(6).getCR();
  }
}
