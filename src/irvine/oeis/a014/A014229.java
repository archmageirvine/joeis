package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014229.
 * @author Sean A. Irvine
 */
public class A014229 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014229() {
    super(Cyclotomic.inverse(220));
  }
}
