package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016030.
 * @author Sean A. Irvine
 */
public class A016030 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016030() {
    super(Cyclotomic.inverse(2021));
  }
}
