package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016102 Inverse of 2093rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016102 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016102() {
    super(Cyclotomic.inverse(2093));
  }
}
