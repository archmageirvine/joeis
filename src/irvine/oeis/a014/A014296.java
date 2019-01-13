package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014296.
 * @author Sean A. Irvine
 */
public class A014296 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014296() {
    super(Cyclotomic.inverse(287));
  }
}
