package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015923.
 * @author Sean A. Irvine
 */
public class A015923 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015923() {
    super(Cyclotomic.inverse(1914));
  }
}
