package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015400.
 * @author Sean A. Irvine
 */
public class A015400 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015400() {
    super(Cyclotomic.inverse(1391));
  }
}
