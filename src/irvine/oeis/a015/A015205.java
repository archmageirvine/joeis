package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015205.
 * @author Sean A. Irvine
 */
public class A015205 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015205() {
    super(Cyclotomic.inverse(1196));
  }
}
