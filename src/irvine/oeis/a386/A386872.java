package irvine.oeis.a386;

import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385662;

/**
 * A386872 Smallest k for which A385662(k) = n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A386872 extends InverseSequence {

  /** Construct the sequence. */
  public A386872() {
    super(1, new A385662());
  }
}
