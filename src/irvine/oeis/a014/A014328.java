package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014328 Inverse of <code>319th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014328 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014328() {
    super(Cyclotomic.inverse(319));
  }
}
