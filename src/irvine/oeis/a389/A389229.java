package irvine.oeis.a389;

import irvine.oeis.InverseSequence;
import irvine.oeis.a388.A388258;

/**
 * A389229 Smallest k for which A388258(k) = n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A389229 extends InverseSequence {

  /** Construct the sequence. */
  public A389229() {
    super(1, new A388258());
  }
}
