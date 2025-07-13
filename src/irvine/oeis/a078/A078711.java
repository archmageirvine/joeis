package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078711 Sequence is S(infinity), where S(1)={1,2,3}, S(n+1)=S(n)S'(n) and S'(n) is obtained from S(n) by changing last term using the cyclic permutation 1-&gt;2-&gt;3-&gt;1.
 * @author Sean A. Irvine
 */
public class A078711 extends Sequence1 {

  private static final char[] MAP = {'2', '3', '1'};
  private final StringBuilder mA = new StringBuilder("123");
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      mA.append(mA);
      final char c = mA.charAt(mA.length() - 1);
      mA.setCharAt(mA.length() - 1, MAP[c - '1']);
    }
    return Z.valueOf(mA.charAt(mN) - '0');
  }
}
