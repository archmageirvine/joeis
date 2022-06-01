package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014812 Inverse of 803rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014812 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014812() {
    super(Cyclotomic.inverse(803));
  }
}
