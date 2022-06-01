package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015343 Inverse of 1334th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015343 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015343() {
    super(Cyclotomic.inverse(1334));
  }
}
