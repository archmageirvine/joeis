package irvine.oeis.a033;

import irvine.oeis.closure.MultiplicativeClosureSequence;
import irvine.oeis.a000.A000041;

/**
 * A033637 Products of partition numbers A000041(n).
 * @author Sean A. Irvine
 */
public class A033637 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A033637() {
    super(new A000041().skip(2));
    setOffset(1);
  }
}
