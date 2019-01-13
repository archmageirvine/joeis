package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015140.
 * @author Sean A. Irvine
 */
public class A015140 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015140() {
    super(Cyclotomic.inverse(1131));
  }
}
