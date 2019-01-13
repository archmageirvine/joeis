package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014763.
 * @author Sean A. Irvine
 */
public class A014763 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014763() {
    super(Cyclotomic.inverse(754));
  }
}
