package irvine.oeis.a081;

import irvine.oeis.InverseSequence;

/**
 * A081214 Least m such that A081212(m) = n.
 * @author Sean A. Irvine
 */
public class A081214 extends InverseSequence {

  /** Construct the sequence. */
  public A081214() {
    super(0, 0, new A081212());
  }
}
