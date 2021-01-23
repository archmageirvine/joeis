package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126593 Numbers that belong to a cycle under the map k = Sum d_i 10^i -&gt; f(k) = Sum d_i 2^i.
 * @author Georg Fischer
 */
public class A126593 extends FiniteSequence {

  /** Construct the sequence. */
  public A126593() {
    super(5, 6, 12, 20, 24, 32, 64, 69, 70, 80, 82, 98, 129, 148, 162, 164, 224, 257, 260, 274, 288, 290, 448, 516, 517, 518, 576, 768);
  }
}
