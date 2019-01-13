package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016327.
 * @author Sean A. Irvine
 */
public class A016327 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016327() {
    super(Cyclotomic.inverse(2318));
  }
}
