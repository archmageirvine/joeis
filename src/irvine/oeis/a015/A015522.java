package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015522.
 * @author Sean A. Irvine
 */
public class A015522 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015522() {
    super(Cyclotomic.inverse(1513));
  }
}
