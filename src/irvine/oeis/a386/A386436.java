package irvine.oeis.a386;

import irvine.oeis.InverseSequence;
import irvine.oeis.a385.A385731;

/**
 * A386436 Smallest k for which A385731(k) = n.
 * @author Sean A. Irvine
 */
public class A386436 extends InverseSequence {

  /** Construct the sequence. */
  public A386436() {
    super(1, new A385731());
  }
}
