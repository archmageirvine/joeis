package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014263;

/**
 * A085586 n, n^2 and n^3 all use only even digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A383939 extends FilterSequence {

  /** Construct the sequence. */
  public A383939() {
    super(1, new A014263(), k -> (Functions.SYNDROME.i(Functions.TRIANGULAR.z(k)) & 0b1010101010) == 0);
  }
}
