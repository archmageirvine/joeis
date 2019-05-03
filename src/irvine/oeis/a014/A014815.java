package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014815 Inverse of <code>806th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014815 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014815() {
    super(Cyclotomic.inverse(806));
  }
}
