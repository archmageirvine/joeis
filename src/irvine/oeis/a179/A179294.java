package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179294 Decimal expansion of radius of inscribed sphere about a regular icosahedron with edge = 1.
 * @author Sean A. Irvine
 */
public class A179294 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179294() {
    super(CR.valueOf(42).add(CR.valueOf(1620).sqrt()).sqrt().divide(CR.valueOf(12)));
  }
}
