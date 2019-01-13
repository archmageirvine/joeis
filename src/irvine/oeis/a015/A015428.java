package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015428.
 * @author Sean A. Irvine
 */
public class A015428 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015428() {
    super(Cyclotomic.inverse(1419));
  }
}
