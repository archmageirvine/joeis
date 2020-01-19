package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028397 Start at n and iterate the map in <code>A006368; a(n)</code> is the smallest number in the trajectory.
 * @author Sean A. Irvine
 */
public class A028397 implements Sequence {

  private static final int HEURISTIC_BIT_LENGTH = 1000;
  private long mN = -1;

  private Z step(final Z n) {
    final Z t = n.multiply(3);
    if (t.isEven()) {
      return t.divide2();
    } else {
      return t.add(2).divide(4);
    }
  }

  protected void update(final Z n) {
  }

  protected Z min(Z n) {
    Z min = n;
    while (n.bitLength() < HEURISTIC_BIT_LENGTH) {
      n = step(n);
      update(n);
      final int c = n.compareTo(min);
      if (c == 0) {
        break;
      }
      if (c < 0) {
        min = n;
      }
    }
    return min;
  }

  @Override
  public Z next() {
    return min(Z.valueOf(++mN));
  }
}

