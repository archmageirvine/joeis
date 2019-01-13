package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014911.
 * @author Sean A. Irvine
 */
public class A014911 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014911() {
    super(Cyclotomic.inverse(902));
  }
}
