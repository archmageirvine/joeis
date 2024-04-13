package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A066751 Triangular numbers whose reverse is prime.
 * @author Sean A. Irvine
 */
public class A066751 extends FilterSequence {

  /** Construct the sequence. */
  public A066751() {
    super(1, new A000217(), k -> {
      return k.mod(10) != 0 && Functions.REVERSE.z(k).isProbablePrime();
    });
  }
}

