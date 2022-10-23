package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037079 In ternary expansion of n, reading from left to right, digits occur in order ...,0,1,2,0,1,2,...
 * @author Sean A. Irvine
 */
public class A037079 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.TWO);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply(3).add((res.mod(3) + 1) % 3));
    return res;
  }
}
