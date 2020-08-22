package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014422 Inverse of 413th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014422 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014422() {
    super(Cyclotomic.inverse(413));
  }
}
