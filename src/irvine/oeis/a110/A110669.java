package irvine.oeis.a110;

import irvine.oeis.PartialSumSequence;

/**
 * A110669 Sequence is {a(4,n)}, where a(m,n) is defined at sequence A110665.
 * @author Sean A. Irvine
 */
public class A110669 extends PartialSumSequence {

  /** Construct the sequence. */
  public A110669() {
    super(new A110668());
  }
}
