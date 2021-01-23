package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016323 Inverse of 2314th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016323 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016323() {
    super(Cyclotomic.inverse(2314));
  }
}
