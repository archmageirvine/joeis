package irvine.oeis.a056;

import irvine.oeis.InverseSequence;
import irvine.oeis.a001.A001414;

/**
 * A056240 Smallest number whose prime divisors (taken with multiplicity) add to n.
 * @author Sean A. Irvine
 */
public class A056240 extends InverseSequence {

  /** Construct the sequence. */
  public A056240() {
    super(new A001414(), 2);
  }
}

