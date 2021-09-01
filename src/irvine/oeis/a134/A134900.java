package irvine.oeis.a134;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A134900 a(n) = ceiling(n*exp(csc(n))).
 * @author Sean A. Irvine
 */
public class A134900 extends FloorSequence {

  /** Construct the sequence */
  public A134900() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(ComputableReals.SINGLETON.csc(CR.valueOf(n)).exp()).ceil(200);
  }
}
