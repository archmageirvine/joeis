package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084713.
 * @author Sean A. Irvine
 */
public class A395731 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395731() {
    super(1, ComputableReals.SINGLETON.acos(CR.valueOf(Q.ONE_THIRD)).multiply(3).divide(CR.PI));
  }
}
