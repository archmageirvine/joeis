package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014149.
 * @author Sean A. Irvine
 */
public class A014149 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014149() {
    super(Cyclotomic.inverse(140));
  }
}
