package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014996 Inverse of <code>987th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014996 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014996() {
    super(Cyclotomic.inverse(987));
  }
}
