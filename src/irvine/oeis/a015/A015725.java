package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015725 Inverse of 1716th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015725 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015725() {
    super(Cyclotomic.inverse(1716));
  }
}
