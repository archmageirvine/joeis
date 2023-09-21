package irvine.oeis.a078;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078781 Numbers n such that n!-1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A078781 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078781() {
    super(1, 0, new SimpleTransformSequence(new A000142(), k -> k.subtract(1)), SEMIPRIME);
  }
}
