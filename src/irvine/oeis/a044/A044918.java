package irvine.oeis.a044;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.CollectionUtils;

/**
 * A044918 Positive integers whose base-2 run lengths form a palindrome.
 * @author Sean A. Irvine
 */
public class A044918 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  private List<Integer> getLengths(final long n) {
    final ArrayList<Integer> res = new ArrayList<>();
    long prev = -1;
    int len = 0;
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else {
        if (prev != -1) {
          res.add(len);
        }
        prev = r;
        len = 1;
      }
      m /= base();
    }
    res.add(len);
    return res;
  }

  @Override
  public Z next() {
    while (true) {
      if (CollectionUtils.isPalindrome(getLengths(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

