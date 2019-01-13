package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014460.
 * @author Sean A. Irvine
 */
public class A014460 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014460() {
    super(Cyclotomic.inverse(451));
  }
}
