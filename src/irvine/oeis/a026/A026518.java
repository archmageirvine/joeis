package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;

/**
 * A026518 <code>a(n) =</code> length of n-th run of identical symbols in <code>A026517</code>.
 * @author Sean A. Irvine
 */
public class A026518 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026518() {
    super(new A026517());
  }
}
