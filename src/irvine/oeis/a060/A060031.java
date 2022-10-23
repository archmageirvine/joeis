package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060031 Katydid sequence: closed under n -&gt; 2n + 2 and 7n + 7.
 * @author Sean A. Irvine
 */
public class A060031 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    mA.add(res.multiply2().add(2));
    mA.add(res.multiply(7).add(7));
    return res;
  }
}
