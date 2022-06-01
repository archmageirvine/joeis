package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014804 Inverse of 795th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014804 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014804() {
    super(Cyclotomic.inverse(795));
  }
}
