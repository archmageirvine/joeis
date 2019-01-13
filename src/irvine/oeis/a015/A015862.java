package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015862.
 * @author Sean A. Irvine
 */
public class A015862 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015862() {
    super(Cyclotomic.inverse(1853));
  }
}
