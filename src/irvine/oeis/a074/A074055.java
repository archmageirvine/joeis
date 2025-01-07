package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A074055 Numbers n such that A074037(n) = A002034(n).
 * @author Sean A. Irvine
 */
public class A074055 extends FilterPositionSequence {

  private static final A002034 A002034 = new A002034();

  /** Construct the sequence. */
  public A074055() {
    super(1, 1, new A074037(), (n, k) -> k.equals(A002034.a(n)));
  }
}
