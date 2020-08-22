package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015989 Inverse of 1980th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015989 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015989() {
    super(Cyclotomic.inverse(1980));
  }
}
