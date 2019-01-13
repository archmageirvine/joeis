package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016270.
 * @author Sean A. Irvine
 */
public class A016270 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016270() {
    super(Cyclotomic.inverse(2261));
  }
}
