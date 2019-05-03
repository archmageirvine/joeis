package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016118 Inverse of <code>2109th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016118 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016118() {
    super(Cyclotomic.inverse(2109));
  }
}
