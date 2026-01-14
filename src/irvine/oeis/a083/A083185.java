package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A083128.
 * @author Sean A. Irvine
 */
public class A083185 extends FilterSequence {

  /** Construct the sequence. */
  public A083185() {
    super(1, new A002385(), k -> (Functions.SYNDROME.i(k) & 0b0010101100) == 0);
  }
}

