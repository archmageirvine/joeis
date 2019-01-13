package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015280.
 * @author Sean A. Irvine
 */
public class A015280 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015280() {
    super(Cyclotomic.inverse(1271));
  }
}
