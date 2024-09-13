package irvine.oeis.a072;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A072246 Numbers which are simultaneously the number of partitions of some k and the number of distinct partitions of some m.
 * @author Sean A. Irvine
 */
public class A072246 extends IntersectionSequence {

  /** Construct the sequence. */
  public A072246() {
    super(1, new A000009(), new A000041().skip());
  }
}
