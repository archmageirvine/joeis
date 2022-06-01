package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015416 Inverse of 1407th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015416 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015416() {
    super(Cyclotomic.inverse(1407));
  }
}
