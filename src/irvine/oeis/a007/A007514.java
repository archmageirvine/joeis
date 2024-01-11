package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.cons.FactorialExpansionSequence;

/**
 * A007514 Pi = Sum_{n &gt;= 0} a(n)/n!.
 * @author Sean A. Irvine
 */
public class A007514 extends FactorialExpansionSequence {

  /** Construct the sequence. */
  public A007514() {
    super(0, CR.PI);
  }
}
