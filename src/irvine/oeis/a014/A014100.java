package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014100.
 * @author Sean A. Irvine
 */
public class A014100 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014100() {
    super(Cyclotomic.inverse(91));
  }
}
