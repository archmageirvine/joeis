package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015546.
 * @author Sean A. Irvine
 */
public class A015546 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015546() {
    super(Cyclotomic.inverse(1537));
  }
}
