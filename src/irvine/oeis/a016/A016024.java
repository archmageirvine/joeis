package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016024 Inverse of 2015th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016024 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016024() {
    super(Cyclotomic.inverse(2015));
  }
}
