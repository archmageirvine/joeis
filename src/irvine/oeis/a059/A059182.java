package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;

/**
 * A059182 Engel expansion of log(10) = 2.30259...
 * @author Georg Fischer
 */
public class A059182 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A059182() {
    super();
  }

  @Override
  protected CR getN() {
    return CR.LOG10;
  }
}
