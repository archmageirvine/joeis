package irvine.oeis.a296;
// manually; compleq at 2020-09-30 11:27

import irvine.math.z.Z;
import irvine.oeis.ComplementaryEquationSequence;


/**
 * A296285 Solution of the complementary equation a(n) = a(n-1) + a(n-2) + n*b(n-2), where a(0) = 1, a(1) = 2, b(0) = 4, and (a(n)) and (b(n)) are increasing complementary sequences.
 * where a(0) = 1, a(1) = 2, b(0) = 4, and (a(n)) and (b(n)) are increasing complementary sequences.
 * @author Georg Fischer
 */
public class A296285 extends ComplementaryEquationSequence {

  /**
   * Construct the sequence.
   */
  public A296285() {
    super(0, "[[0],[1],[1],[-1]]", new String[]{"[1, 2, 11, 25]", "[3, 4, 5]"});
    // this works -> b(0) is broken in the OEIS?
  }

  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(n * b(n - 2));
  }

}
