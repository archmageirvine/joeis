package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016039.
 * @author Sean A. Irvine
 */
public class A016039 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016039() {
    super(Cyclotomic.inverse(2030));
  }
}
