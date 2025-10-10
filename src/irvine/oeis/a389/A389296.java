package irvine.oeis.a389;

import irvine.oeis.InverseSequence;
import irvine.oeis.a386.A386476;

/**
 * A389296 Smallest k for which A386476(k) = n.
 * @author Sean A. Irvine
 */
public class A389296 extends InverseSequence {

  /** Construct the sequence. */
  public A389296() {
    super(1, new A386476());
  }
}
