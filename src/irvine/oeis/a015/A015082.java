package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015082 Inverse of 1073rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015082 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015082() {
    super(Cyclotomic.inverse(1073));
  }
}
