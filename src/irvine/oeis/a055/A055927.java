package irvine.oeis.a055;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051950;

/**
 * A055927 Numbers k such that k + 1 has one more divisor than k.
 * @author Sean A. Irvine
 */
public class A055927 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A055927() {
    super(1, new A051950(), 1);
  }
}
