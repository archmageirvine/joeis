package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016180 Inverse of 2171st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016180 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016180() {
    super(Cyclotomic.inverse(2171));
  }
}
