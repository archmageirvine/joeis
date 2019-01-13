package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014526.
 * @author Sean A. Irvine
 */
public class A014526 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014526() {
    super(Cyclotomic.inverse(517));
  }
}
