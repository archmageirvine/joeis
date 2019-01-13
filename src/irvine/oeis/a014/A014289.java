package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014289.
 * @author Sean A. Irvine
 */
public class A014289 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014289() {
    super(Cyclotomic.inverse(280));
  }
}
