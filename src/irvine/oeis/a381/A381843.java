package irvine.oeis.a381;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A381843 Decimal expansion of (40320*e^9 - 322560*e^8 + 987840*e^7 - 1451520*e^6 + 1050000*e^5 - 344064*e^4 + 40824*e^3 - 1024*e^2 + e) / 40320.
 * @author Sean A. Irvine
 */
public class A381843 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381843() {
    super(2, ComputableReals.SINGLETON.sum(0, 8,
      k -> CR.valueOf(9 - k).exp().multiply(Z.valueOf(9 - k).pow(k)).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.l(k))));
  }
}
