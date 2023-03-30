package irvine.oeis.a062;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062406 Cardinality of the (ordered) list L_n defined inductively by: L_1 = {2}; L_(n+1) = L_n - {p}, where p is the first member of L_n, from left to right, such that prime(n+1) can be appended to the end or beginning of p so that the neighboring digits are equal, if p exists; append prime(n+1) to the end of L_n, otherwise.
 * @author Sean A. Irvine
 */
public class A062406 extends A000040 {

  private final ArrayList<String> mA = new ArrayList<>();

  @Override
  public Z next() {
    final String p = super.next().toString();
    for (final String q : mA) {
      if (p.charAt(0) == q.charAt(q.length() - 1) || p.charAt(p.length() - 1) == q.charAt(0)) {
        mA.remove(q);
        return Z.valueOf(mA.size());
      }
    }
    mA.add(p);
    return Z.valueOf(mA.size());
  }
}
