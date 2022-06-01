package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014944 Inverse of 935th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014944 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014944() {
    super(Cyclotomic.inverse(935));
  }
}
