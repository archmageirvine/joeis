package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015420 Inverse of 1411th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015420 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015420() {
    super(Cyclotomic.inverse(1411));
  }
}
