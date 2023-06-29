package irvine.oeis.a049;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a033.A033493;

/**
 * A049074 Ulam's conjecture (steps to return n to 1 after division by 2 and, if needed, multiplication by 3 with 1 added).
 * @author Sean A. Irvine
 */
public class A049074 extends PrependSequence {

  /** Construct the sequence. */
  public A049074() {
    super(1, new SkipSequence(new A033493(), 1), 8);
  }
}
