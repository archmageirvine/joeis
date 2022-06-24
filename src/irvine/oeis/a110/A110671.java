package irvine.oeis.a110;

import irvine.oeis.PartialSumSequence;

/**
 * A110671 Sequence is {a(6,n)}, where a(m,n) is defined at sequence A110665.
 * @author Sean A. Irvine
 */
public class A110671 extends PartialSumSequence {

  /** Construct the sequence. */
  public A110671() {
    super(new A110670());
  }
}
