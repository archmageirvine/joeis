package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015652.
 * @author Sean A. Irvine
 */
public class A015652 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015652() {
    super(Cyclotomic.inverse(1643));
  }
}
