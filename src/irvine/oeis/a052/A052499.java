package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052499 If n is in the sequence then so are 2n and 4n-1.
 * @author Sean A. Irvine
 */
public class A052499 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply2());
    mA.add(res.multiply(4).subtract(1));
    return res;
  }
}

