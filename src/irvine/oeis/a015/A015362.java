package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015362.
 * @author Sean A. Irvine
 */
public class A015362 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015362() {
    super(Cyclotomic.inverse(1353));
  }
}
