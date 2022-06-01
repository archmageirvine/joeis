package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014877 Inverse of 868th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014877 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014877() {
    super(Cyclotomic.inverse(868));
  }
}
