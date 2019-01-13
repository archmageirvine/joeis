package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014594.
 * @author Sean A. Irvine
 */
public class A014594 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014594() {
    super(Cyclotomic.inverse(585));
  }
}
