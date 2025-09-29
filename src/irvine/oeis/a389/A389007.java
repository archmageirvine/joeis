package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A389007 Semiprimes whose least decimal digit is 2.
 * @author Sean A. Irvine
 */
public class A389007 extends FilterSequence {

  /** Construct the sequence. */
  public A389007() {
    super(1, new A001358(), k -> (Functions.SYNDROME.i(k) & 0b111) == 0b100);
  }
}
