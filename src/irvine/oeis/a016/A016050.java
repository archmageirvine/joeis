package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016050.
 * @author Sean A. Irvine
 */
public class A016050 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016050() {
    super(Cyclotomic.inverse(2041));
  }
}
