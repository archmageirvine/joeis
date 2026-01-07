package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390355 allocated for Ryota Inagaki.
 * @author Sean A. Irvine
 */
public class A390355 extends Sequence0 {

  // After Python

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    long largest = 1;
    LinkedList<Long> l1 = new LinkedList<>();
    l1.add(1L << mN);
    boolean stab = false;
    while (!stab) {
      final LinkedList<Long> l2 = new LinkedList<>();
      long prev = 0;
      for (final long v : l1) {
        l2.add(v / 2 + prev / 2);
        prev = v;
      }
      l2.add(prev / 2);
      l1 = l2;
      stab = true;
      for (final long v : l1) {
        if (v > 1) {
          stab = false;
          break;
        }
      }
      if (l1.peekFirst() == 0) {
        l1.pollFirst();
      }
      if (l1.peekLast() == 0) {
        l1.pollLast();
      }
      largest = Math.max(largest, l1.size());
    }
    return Z.valueOf(largest);
  }
}
