package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A158997 Palindromes of the form <code>m*reversal(m)+1</code> where m <code>&gt;= reversal(m)</code>, sorted on m.
 * @author Sean A. Irvine
 */
public class A158997 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final long r = Long.parseLong(new StringBuilder(s).reverse().toString());
      if (mN >= r) {
        final Z product = Z.valueOf(r).multiply(mN).add(1);
        final String q = product.toString();
        if (StringUtils.isPalindrome(q)) {
          return product;
        }
      }
    }
  }
}

