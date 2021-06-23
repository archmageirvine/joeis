package irvine.oeis.a048;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001097;

/**
 * A048599 Partial products of the sequence (A001097) of twin primes.
 * @author Sean A. Irvine
 */
public class A048599 extends PartialProductSequence  {

  /** Construct the sequence. */
  public A048599() {
    super(new PrependSequence(new A001097(), 1));
  }
}

