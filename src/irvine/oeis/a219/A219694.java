package irvine.oeis.a219;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A219694 Triangular array read by rows:  T(n,k) is the number of functions f:{1,2,...,n} -&gt; {1,2,...,n} that have exactly k nonrecurrent elements; n&gt;=1, 0&lt;=k&lt;=n-1.
 * @author Gregory Morse
 */
public class A219694 extends Triangle {
  /** Construct the sequence. */
  public A219694() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k)).multiply(n + 1L - k).multiply(Z.valueOf(n + 1L).pow(k));
  }
}
