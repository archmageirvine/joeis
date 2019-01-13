package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014984.
 * @author Sean A. Irvine
 */
public class A014984 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014984() {
    super(Cyclotomic.inverse(975));
  }
}
