package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007319 A grasshopper sequence: closed under n -&gt; 2n+2 and 6n+6.
 * @author Sean A. Irvine
 */
public class A007319 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply2().add(2));
    mA.add(res.multiply(6).add(6));
    return res;
  }
}
