package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016266.
 * @author Sean A. Irvine
 */
public class A016266 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016266() {
    super(Cyclotomic.inverse(2257));
  }
}
