package irvine.oeis.a387;

import irvine.oeis.InverseSequence;
import irvine.oeis.a386.A386776;

/**
 * A387903 Smallest k for which A386776(k) = n.
 * @author Sean A. Irvine
 */
public class A387903 extends InverseSequence {

  /** Construct the sequence. */
  public A387903() {
    super(1, new A386776());
  }
}
