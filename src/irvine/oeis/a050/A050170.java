package irvine.oeis.a050;
// manually parm3 at 2021-08-06

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A050170 a(1) = 1, a(n) = floor(a(n-1)/sqrt(5)) if this is not among 0,a(1),...,a(n-1); otherwise a(n) = floor(a(n-1))*sqrt(5)).
 * @author Georg Fischer
 */
public class A050170 extends A050000 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  
  /** Construct the sequence. */
  public A050170() {
    super(77, 77); // irrelevant
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    Z result = CR.valueOf(mPrev).divide(SQRT5).floor();
    if (mA.contains(result)) {
      result = CR.valueOf(mPrev).multiply(SQRT5).floor();
    }
    mA.add(result);
    mPrev = result;
    return result;
  }
}

