package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015127.
 * @author Sean A. Irvine
 */
public class A015127 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015127() {
    super(Cyclotomic.inverse(1118));
  }
}
