package irvine.oeis.a212;

import irvine.math.z.Z;

/**
 * A212221 Square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals: A(n,k) is 1/(2*n) times the number of n-colorings of the complete tripartite graph K_(k,k,k).
 * @author Gregory Morse
 */
public class A212221 extends A212085 {
  /** Construct the sequence. */
  public A212221() {
    super(3);
  }

  @Override
  protected Z t(final int colors, final int size) {
    return super.t(colors, size).divide(2L * colors);
  }
}
