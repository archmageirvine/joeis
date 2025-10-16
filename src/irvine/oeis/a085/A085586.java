package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014263;

/**
 * A085586 n, n^2 and n^3 all use only even digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A085586 extends FilterSequence {

  /** Construct the sequence. */
  public A085586() {
    super(1, new A014263(), k -> (Functions.SYNDROME.i(k.square()) & 0b1010101010) == 0 && (Functions.SYNDROME.i(k.pow(3)) & 0b1010101010) == 0);
  }
}
