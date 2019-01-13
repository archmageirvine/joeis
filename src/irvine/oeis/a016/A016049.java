package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016049.
 * @author Sean A. Irvine
 */
public class A016049 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016049() {
    super(Cyclotomic.inverse(2040));
  }
}
