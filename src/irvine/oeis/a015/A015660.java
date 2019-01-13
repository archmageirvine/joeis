package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015660.
 * @author Sean A. Irvine
 */
public class A015660 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015660() {
    super(Cyclotomic.inverse(1651));
  }
}
