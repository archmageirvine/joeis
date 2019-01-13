package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015342.
 * @author Sean A. Irvine
 */
public class A015342 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015342() {
    super(Cyclotomic.inverse(1333));
  }
}
