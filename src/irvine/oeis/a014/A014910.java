package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014910.
 * @author Sean A. Irvine
 */
public class A014910 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014910() {
    super(Cyclotomic.inverse(901));
  }
}
