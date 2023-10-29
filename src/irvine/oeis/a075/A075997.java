package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075997 a(n) = [n/2] - [n/3] + [n/4] - [n/5] + [n/6] - ..., where [n/k] = floor(n/k).
 * Maple: A075997:=n-&gt;add(floor(n/(2*i))-floor((n-i)/(2*i)), i=1..n):
 * @author Georg Fischer
 */
public class A075997 extends Sequence0 {

  private int mN;

  /** Construct the sequence. */
  public A075997() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, i -> Z.valueOf(mN / (2L * i)).subtract((mN - i) / (2L * i)));
  }
}
