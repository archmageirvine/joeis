package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067854 a(n) = cardinality of the (ordered) list L_n defined inductively by: L_1 = {2}; if, reading from left to right, there is a member p of L_n such that prime(n+1) can be appended to the beginning or end of p so that their neighboring digits are equal, then append prime(n+1) to the beginning or end of p to obtain L_(n+1); otherwise, add prime(n+1) to the end of the list L_n to obtain L_(n+1).
 * @author Sean A. Irvine
 */
public class A067854 extends A000040 {

  private final List<String> mA = new ArrayList<>();

  @Override
  public Z next() {
    final String p = super.next().toString();
    final char first = p.charAt(0);
    final char last = p.charAt(p.length() - 1);
    for (int k = 0; k < mA.size(); ++k) {
      final String s = mA.get(k);
      if (s.charAt(0) == last) {
        mA.set(k, p + s);
        return Z.valueOf(mA.size());
      }
      if (s.charAt(s.length() - 1) == first) {
        mA.set(k, s + p);
        return Z.valueOf(mA.size());
      }
    }
    mA.add(p);
    return Z.valueOf(mA.size());
  }
}
