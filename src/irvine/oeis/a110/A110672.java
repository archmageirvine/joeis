package irvine.oeis.a110;

import irvine.oeis.PartialSumSequence;

/**
 * A110672 Sequence is {a(7,n)}, where a(m,n) is defined in sequence A110665.
 * @author Sean A. Irvine
 */
public class A110672 extends PartialSumSequence {

  /** Construct the sequence. */
  public A110672() {
    super(new A110671());
  }
}
