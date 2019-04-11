package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113164 <code>a(n) = (6</code> choose <code>n) * (6</code> choose <code>6-n)</code>.
 * @author Georg Fischer
 */
public class A113164 extends FiniteSequence {

  /** Construct the sequence. */
  public A113164() {
    super(1, 36, 225, 400, 225, 36, 1);
  }
}
