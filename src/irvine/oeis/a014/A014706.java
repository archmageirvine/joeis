package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014706.
 * @author Sean A. Irvine
 */
public class A014706 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014706() {
    super(Cyclotomic.inverse(697));
  }
}
