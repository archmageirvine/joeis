package irvine.oeis.a110;

import irvine.oeis.PartialSumSequence;

/**
 * A110668 Sequence is {a(3,n)}, where a(m,n) is defined at sequence A110665.
 * @author Sean A. Irvine
 */
public class A110668 extends PartialSumSequence {

  /** Construct the sequence. */
  public A110668() {
    super(new A110667());
  }
}
