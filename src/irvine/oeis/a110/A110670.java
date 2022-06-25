package irvine.oeis.a110;

import irvine.oeis.PartialSumSequence;

/**
 * A110670 Sequence is {a(5,n)}, where a(m,n) is defined at sequence A110665.
 * @author Sean A. Irvine
 */
public class A110670 extends PartialSumSequence {

  /** Construct the sequence. */
  public A110670() {
    super(new A110669());
  }
}
