package irvine.oeis.a097;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000254;

/**
 * A097422 Sum{k=1 to n} H(k) k!, where H(k) = sum{j=1 to k} 1/j.
 * @author Sean A. Irvine
 */
public class A097422 extends PartialSumSequence {

  /** Construct the sequence. */
  public A097422() {
    super(new A000254());
  }
}
