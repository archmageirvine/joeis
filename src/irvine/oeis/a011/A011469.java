package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011469 Decimal expansion of 50th root of 50.
 * @author Sean A. Irvine
 */
public class A011469 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(50);

  /** Construct the sequence. */
  public A011469() {
    super(ComputableReals.SINGLETON.pow(M, M.inverse()));
  }
}
