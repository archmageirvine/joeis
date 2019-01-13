package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015795.
 * @author Sean A. Irvine
 */
public class A015795 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015795() {
    super(Cyclotomic.inverse(1786));
  }
}
