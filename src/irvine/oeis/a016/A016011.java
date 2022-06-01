package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016011 Inverse of 2002nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016011 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016011() {
    super(Cyclotomic.inverse(2002));
  }
}
