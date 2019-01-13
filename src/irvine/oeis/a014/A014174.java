package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014174.
 * @author Sean A. Irvine
 */
public class A014174 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014174() {
    super(Cyclotomic.inverse(165));
  }
}
