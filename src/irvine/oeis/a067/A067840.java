package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A067840 Factorial expansion of e^2 : exp(2) = Sum_{n &gt;= 0} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A067840 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A067840() {
    super(0, CR.TWO.exp());
  }
}
