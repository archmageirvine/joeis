package irvine.oeis.a076;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a062.A062481;

/**
 * A076955 Product_{i=1..n} i^prime(i).
 * @author Sean A. Irvine
 */
public class A076955 extends PartialProductSequence {

  /** Construct the sequence. */
  public A076955() {
    super(1, new A062481());
  }
}

