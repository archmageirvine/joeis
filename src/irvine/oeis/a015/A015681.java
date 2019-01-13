package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015681.
 * @author Sean A. Irvine
 */
public class A015681 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015681() {
    super(Cyclotomic.inverse(1672));
  }
}
