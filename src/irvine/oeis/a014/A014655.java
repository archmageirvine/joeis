package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014655 Inverse of 646th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014655 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014655() {
    super(Cyclotomic.inverse(646));
  }
}
