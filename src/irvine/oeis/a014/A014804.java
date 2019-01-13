package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014804.
 * @author Sean A. Irvine
 */
public class A014804 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014804() {
    super(Cyclotomic.inverse(795));
  }
}
