package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016179 Inverse of 2170th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016179 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016179() {
    super(Cyclotomic.inverse(2170));
  }
}
