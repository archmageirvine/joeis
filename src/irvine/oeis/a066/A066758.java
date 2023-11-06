package irvine.oeis.a066;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A066758 Triangular numbers not divisible by 10 whose reverse is pentagonal.
 * @author Sean A. Irvine
 */
public class A066758 extends FilterSequence {

  /** Construct the sequence. */
  public A066758() {
    super(new A000217(), k -> k.isZero() || (k.mod(10) != 0 && ZUtils.isPolygonal(ZUtils.reverse(k), 5)));
  }
}

