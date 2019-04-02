package irvine.oeis.a003;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A003823 Power series expansion of the Rogers-Ramanujan continued fraction 1+x/(1+x^2/(1+x^3/(1+x^4/(1+...)))).
 * @author Sean A. Irvine
 */
public class A003823 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A003823() {
    super(new PeriodicSequence(1, -1, -1, 1, 0), 0);
  }
}
