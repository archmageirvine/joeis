package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059588 a(n)=Sum_{i=0..n} |stirling1(n,i)|*2^(2^i).
 * @author Sean A. Irvine
 */
public class A059588 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.STIRLING1.z(mN, k).abs().shiftLeft(1L << k));
  }
}
