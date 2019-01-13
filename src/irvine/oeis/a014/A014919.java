package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014919.
 * @author Sean A. Irvine
 */
public class A014919 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014919() {
    super(Cyclotomic.inverse(910));
  }
}
