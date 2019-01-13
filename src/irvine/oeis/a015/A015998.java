package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015998.
 * @author Sean A. Irvine
 */
public class A015998 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015998() {
    super(Cyclotomic.inverse(1989));
  }
}
