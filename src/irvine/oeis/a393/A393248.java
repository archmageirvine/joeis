package irvine.oeis.a393;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393248 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A393248 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    String s = Long.toBinaryString(++mN);
    final HashMap<String, Integer> seen = new HashMap<>();
    int pos = 0;
    while (seen.putIfAbsent(s, pos) == null) {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < s.length(); ++k) {
        sb.append(s.charAt(k) == s.charAt((k + 1) % s.length()) ? '0' : '1');
      }
      s = sb.toString();
      ++pos;
    }
    return Z.valueOf(pos - seen.get(s));
  }
}
