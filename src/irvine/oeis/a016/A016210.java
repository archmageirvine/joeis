package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016210.
 * @author Sean A. Irvine
 */
public class A016210 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016210() {
    super(Cyclotomic.inverse(2201));
  }
}
