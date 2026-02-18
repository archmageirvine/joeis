package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A083806 Perfect powers using only prime digits and 1.
 * @author Sean A. Irvine
 */
public class A083806 extends FilterSequence {

  /** Construct the sequence. */
  public A083806() {
    super(1, new A001597(), k -> (Functions.SYNDROME.i(k) & 0b1101010001) == 0);
  }
}

