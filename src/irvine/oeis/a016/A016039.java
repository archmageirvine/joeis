package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016039 Inverse of 2030th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016039 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016039() {
    super(Cyclotomic.inverse(2030));
  }
}
