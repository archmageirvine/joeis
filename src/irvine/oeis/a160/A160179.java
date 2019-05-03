package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160179 <code>a(1)=2. a(n)</code> equals the product of the previous terms divided by the <code>(n-1)st</code> prime gap.
 * @author Georg Fischer
 */
public class A160179 extends FiniteSequence {

  /** Construct the sequence. */
  public A160179() {
    super(2, 2, 2, 4, 8, 128, 8192, 134217728L, 9007199254740992L);
  }
}
