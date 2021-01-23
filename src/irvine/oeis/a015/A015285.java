package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015285 Inverse of 1276th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015285 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015285() {
    super(Cyclotomic.inverse(1276));
  }
}
