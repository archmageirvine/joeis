package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014883.
 * @author Sean A. Irvine
 */
public class A014883 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014883() {
    super(Cyclotomic.inverse(874));
  }
}
