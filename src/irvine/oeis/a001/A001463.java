package irvine.oeis.a001;

import irvine.oeis.PartialSumSequence;

/**
 * A001463 Partial sums of A001462; also <code>a(n)</code> is the last occurrence of n in A001462.
 * @author Sean A. Irvine
 */
public class A001463 extends PartialSumSequence {

  /** Construct the sequence. */
  public A001463() {
    super(new A001462());
  }
}
