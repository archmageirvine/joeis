package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015231.
 * @author Sean A. Irvine
 */
public class A015231 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015231() {
    super(Cyclotomic.inverse(1222));
  }
}
