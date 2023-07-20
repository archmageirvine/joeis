package irvine.oeis.a033;

import irvine.oeis.closure.MultiplicativeClosureSequence;
import irvine.oeis.a002.A002385;

/**
 * A033620 Numbers all of whose prime factors are palindromes.
 * @author Sean A. Irvine
 */
public class A033620 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A033620() {
    super(new A002385());
    setOffset(1);
  }
}
