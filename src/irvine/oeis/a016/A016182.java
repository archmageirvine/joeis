package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016182 Inverse of 2173rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016182 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016182() {
    super(Cyclotomic.inverse(2173));
  }
}
