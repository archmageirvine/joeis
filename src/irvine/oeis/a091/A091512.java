package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A091512 a(n) is the largest integer m such that 2^m divides (2*n)^n, i.e., the exponent of 2 in (2*n)^n.
 * a(n)=n*(valuation(n, 2)+1).
 * @author Georg Fischer
 */
public class A091512 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A091512() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(ZUtils.valuation(Z.valueOf(mN), Z.TWO)).add(1).multiply(mN);
  }
}
