package irvine.oeis.a072;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072246 extends IntersectionSequence {

  /** Construct the sequence. */
  public A072246() {
    super(1, new A000009(), new A000041().skip());
  }
}
