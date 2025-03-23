package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A382026 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382026() {
    super(2, ComputableReals.SINGLETON.sum(0, 9,
      k -> CR.valueOf(10 - k).exp().multiply(Z.valueOf(10 - k).pow(k)).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.l(k))));
  }
}
