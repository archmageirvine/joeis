package irvine.oeis.a394;

import irvine.math.z.Z;

/**
 * A394950 Number of equivalence classes of well-formed bracketed words of total length 2n built from the symbol * (of length 2) and four unary bracket types (), [], {}, and &lt;&gt;, with no empty bracket pair, modulo commutativity of concatenation.
 * @author Sean A. Irvine
 */
public class A394950 extends A394948 {

  @Override
  protected Z b(final long n) {
    return n == 1 ? Z.ONE : a(n - 1).multiply(4);
  }
}
