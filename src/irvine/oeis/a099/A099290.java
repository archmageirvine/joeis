package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099290 Decimal expansion of the Fresnel cosine integral function at 1.
 * @author Sean A. Irvine
 */
public class A099290 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099290() {
    super(0, CrFunctions.FRESNEL_C.cr(CR.ONE));
  }
}
