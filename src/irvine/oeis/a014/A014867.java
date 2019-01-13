package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014867.
 * @author Sean A. Irvine
 */
public class A014867 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014867() {
    super(Cyclotomic.inverse(858));
  }
}
