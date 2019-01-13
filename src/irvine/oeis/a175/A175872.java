package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A175872.
 * @author Sean A. Irvine
 */
public class A175872 implements Sequence {

  private int mN = 0;

  private ArrayList<Integer> runCount(final ArrayList<Integer> in) {
    final ArrayList<Integer> out = new ArrayList<>();
    int c = 0;
    Integer prev = null;
    for (final Integer s : in) {
      if (s.equals(prev)) {
        ++c;
      } else {
        if (prev != null) {
          out.add(c);
        }
        prev = s;
        c = 1;
      }
    }
    out.add(c);
    return out;
  }

  private boolean isAllOnes(final ArrayList<Integer> in) {
    for (final Integer s : in) {
      if (s != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final String n = Integer.toBinaryString(++mN);
    ArrayList<Integer> list = new ArrayList<>();
    for (int k = 0; k < n.length(); ++k) {
      list.add(n.charAt(k) - '0');
    }
    while (!isAllOnes(list)) {
      list = runCount(list);
    }
    return Z.valueOf(list.size());
  }
}

