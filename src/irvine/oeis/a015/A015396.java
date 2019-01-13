package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015396.
 * @author Sean A. Irvine
 */
public class A015396 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015396() {
    super(Cyclotomic.inverse(1387));
  }
}
