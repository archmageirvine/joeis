package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016242 Inverse of 2233rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016242 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016242() {
    super(Cyclotomic.inverse(2233));
  }
}
