package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A059970 Nim-factorials: a(1)=1 and, for n&gt;1, a(n)=n*a(n-1), where * denotes Nim multiplication.
 * @author Sean A. Irvine
 */
public class A059970 extends A051775 {

  /** Construct the sequence. */
  public A059970() {
    super(1);
  }

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = get(mF, Z.valueOf(++mN));
    return mF;
  }
}
