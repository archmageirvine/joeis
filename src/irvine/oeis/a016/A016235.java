package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016235 Inverse of <code>2226th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016235 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016235() {
    super(Cyclotomic.inverse(2226));
  }
}
