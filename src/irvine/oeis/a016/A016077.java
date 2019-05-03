package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016077 Inverse of <code>2068th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016077 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016077() {
    super(Cyclotomic.inverse(2068));
  }
}
