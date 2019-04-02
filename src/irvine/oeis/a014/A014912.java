package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014912 Inverse of 903rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014912 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014912() {
    super(Cyclotomic.inverse(903));
  }
}
