package irvine.oeis.a083;

import irvine.oeis.PartialSumSequence;

/**
 * A083056 a(n) = 3*A083055(n)-n.
 * @author Sean A. Irvine
 */
public class A083057 extends PartialSumSequence {

  /** Construct the sequence. */
  public A083057() {
    super(new A083056());
  }
}

