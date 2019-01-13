package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015590.
 * @author Sean A. Irvine
 */
public class A015590 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015590() {
    super(Cyclotomic.inverse(1581));
  }
}
