package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014536.
 * @author Sean A. Irvine
 */
public class A014536 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014536() {
    super(Cyclotomic.inverse(527));
  }
}
