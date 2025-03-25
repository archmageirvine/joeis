package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382020 Decimal expansion of (5040*e^8 - 35280*e^7 + 90720*e^6 - 105000*e^5 + 53760*e^4 - 10206*e^3 + 448*e^2 - e) / 5040.
 * @author Sean A. Irvine
 */
public class A382020 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382020() {
    super(2, ComputableReals.SINGLETON.sum(0, 7,
      k -> CR.valueOf(8 - k).exp().multiply(Z.valueOf(8 - k).pow(k)).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.l(k))));
  }
}
