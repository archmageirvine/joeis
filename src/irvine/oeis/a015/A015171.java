package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015171.
 * @author Sean A. Irvine
 */
public class A015171 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015171() {
    super(Cyclotomic.inverse(1162));
  }
}
