package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015885 Inverse of <code>1876th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015885 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015885() {
    super(Cyclotomic.inverse(1876));
  }
}
