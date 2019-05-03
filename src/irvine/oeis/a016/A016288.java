package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016288 Inverse of <code>2279th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016288 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016288() {
    super(Cyclotomic.inverse(2279));
  }
}
