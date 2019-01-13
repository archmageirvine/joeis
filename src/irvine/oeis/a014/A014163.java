package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014163.
 * @author Sean A. Irvine
 */
public class A014163 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014163() {
    super(Cyclotomic.inverse(154));
  }
}
