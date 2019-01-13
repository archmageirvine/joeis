package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015343.
 * @author Sean A. Irvine
 */
public class A015343 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015343() {
    super(Cyclotomic.inverse(1334));
  }
}
