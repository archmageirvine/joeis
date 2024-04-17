package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a004.A004001;

/**
 * A051284 a(n) is the number k, 2^n &lt; k &lt; 2^(n+1), such that k/c(k) is a minimum in the interval, where c(k) is Hofstadter-Conway sequence A004001.
 * @author Sean A. Irvine
 */
public class A051284 extends A004001 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    Q min = Q.TWO;
    int minN = 0;
    while (true) {
      final Z t = super.next();
      final int n = size();
      final Q m = new Q(n, t);
      if (m.compareTo(min) < 0) {
        min = m;
        minN = size();
      }
      if ((n & (n - 1)) == 0) {
        return Z.valueOf(minN);
      }
    }
  }
}
