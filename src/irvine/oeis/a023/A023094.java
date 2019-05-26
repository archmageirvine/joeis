package irvine.oeis.a023;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023094 <code>a(n)</code> is least k such that k and <code>2k</code> are anagrams in base <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023094 implements Sequence {

  private int mBase = multiple();

  private ArrayList<Integer> syndrome(long n, final int base) {
    final ArrayList<Integer> res = new ArrayList<>();
    while (n != 0) {
      res.add((int) (n % base));
      n /= base;
    }
    Collections.sort(res);
    return res;
  }

  protected int multiple() {
    return 2;
  }

  @Override
  public Z next() {
    ++mBase;
    long k = 0;
    while (true) {
      ++k;
      if (syndrome(k, mBase).equals(syndrome(multiple() * k, mBase))) {
        return Z.valueOf(k);
      }
    }
  }
}
