package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015416 Inverse of <code>1407th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015416 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015416() {
    super(Cyclotomic.inverse(1407));
  }
}
