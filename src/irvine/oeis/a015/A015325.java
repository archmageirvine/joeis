package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015325.
 * @author Sean A. Irvine
 */
public class A015325 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015325() {
    super(Cyclotomic.inverse(1316));
  }
}
