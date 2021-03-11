package irvine.oeis.a044;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044918 n-th positive integer whose base 2 run lengths form a palindrome.
 * @author Sean A. Irvine
 */
public class A044918 implements Sequence {

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

  private boolean isPalindrome(final List<?> lst) {
    for (int k = 0, j = lst.size() - 1; k < j; ++k, --j) {
      if (!lst.get(k).equals(lst.get(j))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isPalindrome(getLengths(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

