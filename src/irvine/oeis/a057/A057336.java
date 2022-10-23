package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a022.A022290;

/**
 * A057336 1) Write n in binary; 2) Find run lengths of this expression; 3) Replace these as follows: 1 -&gt; 0, 2 -&gt; 010, 3 -&gt; 01010, 4 -&gt; 0101010...; 4) Remove final 0 and append an initial 1; 5) The term a(n) is the number with the obtained Zeckendorf expression.
 * @author Sean A. Irvine
 */
public class A057336 extends Sequence1 {

  private long mN = 0;

  private List<Integer> rle(long n) {
    final ArrayList<Integer> res = new ArrayList<>();
    long bit = n & 1;
    int cnt = 1;
    n >>= 1;
    while (n != 0) {
      if ((n & 1) == bit) {
        ++cnt;
      } else {
        res.add(cnt);
        bit = 1 - bit;
        cnt = 1;
      }
      n >>>= 1;
    }
    res.add(cnt);
    return res;
  }

  @Override
  public Z next() {
    final List<Integer> rle = rle(++mN);
    final StringBuilder sb = new StringBuilder();
    sb.append("1");
    for (int k = rle.size() - 1; k >= 0; --k) {
      sb.append('0');
      sb.append("10".repeat(Math.max(0, rle.get(k) - 1)));
    }
    return A022290.zeckendorf(new Z(sb, 2).divide2());
  }

}
