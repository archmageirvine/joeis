package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014999.
 * @author Sean A. Irvine
 */
public class A014999 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014999() {
    super(Cyclotomic.inverse(990));
  }
}
