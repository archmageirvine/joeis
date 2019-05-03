package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015122 Inverse of <code>1113th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015122 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015122() {
    super(Cyclotomic.inverse(1113));
  }
}
