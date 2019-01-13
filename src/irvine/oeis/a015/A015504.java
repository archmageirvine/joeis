package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015504.
 * @author Sean A. Irvine
 */
public class A015504 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015504() {
    super(Cyclotomic.inverse(1495));
  }
}
