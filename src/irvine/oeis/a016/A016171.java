package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016171 Inverse of 2162nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016171 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016171() {
    super(Cyclotomic.inverse(2162));
  }
}
