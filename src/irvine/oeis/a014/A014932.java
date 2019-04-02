package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014932 Inverse of 923rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014932 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014932() {
    super(Cyclotomic.inverse(923));
  }
}
