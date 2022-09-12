package irvine.oeis.a059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059095 List consisting of the representation of n in base 3 using digits -1, 0, 1.
 * @author Sean A. Irvine
 */
public class A059095 implements Sequence {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private long mN = 0;

  final List<Integer> b3(final long n) {
    if (n == 0) {
      return Collections.emptyList();
    }
    final ArrayList<Integer> res = new ArrayList<>();
    switch ((int) (n % 3)) {
      case 0:
        res.addAll(b3(n / 3));
        res.add(0);
        break;
      case 1:
        res.addAll(b3(n / 3));
        res.add(1);
        break;
      case 2:
      default:
        res.addAll(b3(n / 3 + 1));
        res.add(-1);
        break;
    }
    return res;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.addAll(b3(++mN));
    }
    return Z.valueOf(mA.pollFirst());
  }
}
