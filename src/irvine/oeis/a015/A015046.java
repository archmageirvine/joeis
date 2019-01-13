package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015046.
 * @author Sean A. Irvine
 */
public class A015046 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015046() {
    super(Cyclotomic.inverse(1037));
  }
}
