package irvine.oeis.a386;

import irvine.oeis.InverseSequence;

/**
 * A386284 Smallest k for which A386930(k) = n.
 * @author Sean A. Irvine
 */
public class A386284 extends InverseSequence {

  /** Construct the sequence. */
  public A386284() {
    super(1, new A386930());
  }
}
