package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014746.
 * @author Sean A. Irvine
 */
public class A014746 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014746() {
    super(Cyclotomic.inverse(737));
  }
}
