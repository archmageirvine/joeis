package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015343 Inverse of <code>1334th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015343 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015343() {
    super(Cyclotomic.inverse(1334));
  }
}
