package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A068821 Triangular numbers such that both the number formed by the first floor((k+1)/2) digits and the remaining part (if any) are triangular numbers, where k is the number of digits.
 * @author Sean A. Irvine
 */
public class A068821 extends FilterSequence {

  /** Construct the sequence. */
  public A068821() {
    super(1, new A000217().skip(), t -> {
      final String s = t.toString();
      final int k = s.length() / 2;
      return k == 0 || ZUtils.isTriangular(new Z(s.substring(0, k))) && ZUtils.isTriangular(new Z(s.substring(k)));
    });
  }
}
