package irvine.oeis.a027;

import irvine.oeis.FiniteSequence;

/**
 * A027747 <code>a(n) = n^n^n^</code>..^n <code>(6-n</code> terms, <code>n&lt;=5)</code>.
 * @author Georg Fischer
 */
public class A027747 extends FiniteSequence {

  /** Construct the sequence. */
  public A027747() {
    super(1, 65536, 7625597484987L, 256, 5);
  }
}
