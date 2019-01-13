package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015885.
 * @author Sean A. Irvine
 */
public class A015885 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015885() {
    super(Cyclotomic.inverse(1876));
  }
}
