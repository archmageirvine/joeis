package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014877 Inverse of <code>868th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014877 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014877() {
    super(Cyclotomic.inverse(868));
  }
}
