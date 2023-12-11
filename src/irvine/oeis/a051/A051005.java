package irvine.oeis.a051;

import irvine.oeis.a000.A000009;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A051005 PartitionsQ[ A035359 ], i.e., prime values of PartitionsQ.
 * @author Sean A. Irvine
 */
public class A051005 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A051005() {
    super(new A000009());
  }
}

