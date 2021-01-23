package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016079 Inverse of 2070th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016079 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016079() {
    super(Cyclotomic.inverse(2070));
  }
}
