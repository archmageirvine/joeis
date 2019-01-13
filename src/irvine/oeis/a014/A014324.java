package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014324.
 * @author Sean A. Irvine
 */
public class A014324 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014324() {
    super(Cyclotomic.inverse(315));
  }
}
