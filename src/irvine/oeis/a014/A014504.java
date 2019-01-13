package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014504.
 * @author Sean A. Irvine
 */
public class A014504 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014504() {
    super(Cyclotomic.inverse(495));
  }
}
