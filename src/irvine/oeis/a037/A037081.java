package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037081 In ternary expansion of n, reading from left to right, successive runs of the digits occur in order ...,0,1,2,0,1,2,...
 * @author Sean A. Irvine
 */
public class A037081 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.TWO);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long r = res.mod(3);
    if (!res.isZero()) {
      mA.add(res.multiply(3).add(r));
    }
    mA.add(res.multiply(3).add((r + 1) % 3));
    return res;
  }
}
