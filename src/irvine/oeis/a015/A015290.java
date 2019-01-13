package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015290.
 * @author Sean A. Irvine
 */
public class A015290 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015290() {
    super(Cyclotomic.inverse(1281));
  }
}
