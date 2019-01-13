package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015213.
 * @author Sean A. Irvine
 */
public class A015213 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015213() {
    super(Cyclotomic.inverse(1204));
  }
}
