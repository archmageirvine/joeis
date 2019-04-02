package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015252 Inverse of 1243rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015252 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015252() {
    super(Cyclotomic.inverse(1243));
  }
}
