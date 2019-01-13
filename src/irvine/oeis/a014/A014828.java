package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014828.
 * @author Sean A. Irvine
 */
public class A014828 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014828() {
    super(Cyclotomic.inverse(819));
  }
}
