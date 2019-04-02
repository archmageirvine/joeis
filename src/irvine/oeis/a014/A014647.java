package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014647 Inverse of 638th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014647 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014647() {
    super(Cyclotomic.inverse(638));
  }
}
