package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002559 Markoff (or Markov) numbers: union of positive integers x, y, z satisfying x^2 + y^2 + z^2 = 3xyz.
 * @author Sean A. Irvine
 */
public class A002559 implements Sequence {

  private final ArrayList<Z> mMarkov = new ArrayList<>();
  private final TreeSet<Z> mNewValues = new TreeSet<>();
  private int mPos = 0;

  @Override
  public Z next() {
    final int size = mMarkov.size();
    if (size == 0) {
      mNewValues.add(Z.ONE);
    } else {
      do {
        final Z x = mMarkov.get(mPos);
        //System.out.println("Expanding from: " + mPos + " x=" + x);
        for (final Z y : mMarkov) {
          final Z x2 = x.square();
          final Z y2 = y.square();
          final Z d = x2.multiply(y2).multiply(9).subtract(x2.add(y2).multiply(4));
          final Z[] s = d.sqrtAndRemainder();
          if (s[1].isZero()) {
            final Z a2 = x.multiply(y).multiply(3).add(s[0]);
            if (a2.isEven()) {
              final Z a = a2.divide2();
              if (a.compareTo(mMarkov.get(size - 1)) <= 0) {
                throw new RuntimeException("Order crash: " + a + " " + mMarkov.get(size - 1));
              }
              mNewValues.add(a);
            }
          }
        }
      } while (++mPos < size);
    }
    final Z res = mNewValues.pollFirst();
    mMarkov.add(res);
    return res;
  }
}
