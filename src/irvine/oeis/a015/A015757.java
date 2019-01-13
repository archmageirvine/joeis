package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015757.
 * @author Sean A. Irvine
 */
public class A015757 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015757() {
    super(Cyclotomic.inverse(1748));
  }
}
