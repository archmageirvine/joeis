package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015711.
 * @author Sean A. Irvine
 */
public class A015711 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015711() {
    super(Cyclotomic.inverse(1702));
  }
}
