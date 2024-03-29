package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002445;

/**
 * A043296 Sum of digits of denominator of Bernoulli number B(2n).
 * @author Sean A. Irvine
 */
public class A043296 extends A002445 {

  /** Construct the sequence. */
  public A043296() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next().abs()));
  }
}

