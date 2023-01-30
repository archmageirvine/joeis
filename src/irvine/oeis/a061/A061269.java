package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006716;

/**
 * A061269 Squares with nonzero digits such that (1) each digit is a square and (2) the sum of the digits is a square.
 * @author Sean A. Irvine
 */
public class A061269 extends FilterSequence {

  /** Construct the sequence. */
  public A061269() {
    super(new A006716(), k -> LongUtils.isSquare(ZUtils.digitSum(k)));
  }
}
