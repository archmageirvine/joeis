package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382026 Decimal expansion of (362880*e^10 - 3265920*e^9 + 11612160*e^8 - 20744640*e^7 + 19595520*e^6 - 9450000*e^5 + 2064384*e^4 - 157464*e^3 + 2304*e^2 - e) / 362880.
 * @author Sean A. Irvine
 */
public class A382026 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382026() {
    super(2, ComputableReals.SINGLETON.sum(0, 9,
      k -> CR.valueOf(10 - k).exp().multiply(Z.valueOf(10 - k).pow(k)).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.l(k))));
  }
}
