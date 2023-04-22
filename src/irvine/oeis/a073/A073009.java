package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.a098.A098686;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073009 Decimal expansion of Sum_{n &gt;= 1} 1/n^n.
 * @author Sean A. Irvine
 */
public class A073009 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073009() {
    super(1, new A098686(0).getCR().subtract(CR.ONE));
  }
}
