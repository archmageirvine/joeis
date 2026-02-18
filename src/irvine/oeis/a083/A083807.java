package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A083807 Perfect powers using only composite digits 4,6,8,9 and 0.
 * @author Sean A. Irvine
 */
public class A083807 extends FilterSequence {

  /** Construct the sequence. */
  public A083807() {
    super(1, new A001597(), k -> (Functions.SYNDROME.i(k) & 0b0010101110) == 0);
  }
}

