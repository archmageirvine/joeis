package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035931 Number of steps to reach 0 under "k-&gt;max product of two numbers whose concatenation is k".
 * @author Sean A. Irvine
 */
public class A035931 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    Z t = Z.valueOf(++mN);
    while (!t.isZero()) {
      t = A035930.f(t);
      ++c;
    }
    return Z.valueOf(c);
  }
}

