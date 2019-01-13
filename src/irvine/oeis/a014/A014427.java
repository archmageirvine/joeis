package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014427.
 * @author Sean A. Irvine
 */
public class A014427 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014427() {
    super(Cyclotomic.inverse(418));
  }
}
