package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016049 Inverse of <code>2040th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016049 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016049() {
    super(Cyclotomic.inverse(2040));
  }
}
