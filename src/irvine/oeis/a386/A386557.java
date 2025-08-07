package irvine.oeis.a386;

import irvine.oeis.InverseSequence;
import irvine.oeis.a384.A384834;

/**
 * A386557 Smallest k for which A384834(k) = n.
 * @author Sean A. Irvine
 */
public class A386557 extends InverseSequence {

  /** Construct the sequence. */
  public A386557() {
    super(1, new A384834());
  }
}

