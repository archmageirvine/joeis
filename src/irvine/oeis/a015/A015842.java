package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015842 Inverse of 1833rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015842 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015842() {
    super(Cyclotomic.inverse(1833));
  }
}
