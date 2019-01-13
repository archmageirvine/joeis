package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015970.
 * @author Sean A. Irvine
 */
public class A015970 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015970() {
    super(Cyclotomic.inverse(1961));
  }
}
