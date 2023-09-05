package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A065408 Squares whose digits sum to a prime.
 * @author Sean A. Irvine
 */
public class A065408 extends FilterSequence {

  /** Construct the sequence. */
  public A065408() {
    super(1, new A000290(), k -> Z.valueOf(ZUtils.digitSum(k)).isProbablePrime());
  }
}
