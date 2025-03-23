package irvine.oeis.a381;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076082.
 * @author Sean A. Irvine
 */
public class A381843 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A381843() {
    super(2, ComputableReals.SINGLETON.sum(0, 8,
      k -> CR.valueOf(9 - k).exp().multiply(Z.valueOf(9 - k).pow(k)).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.l(k))));
  }
}
