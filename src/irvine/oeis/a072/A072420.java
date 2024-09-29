package irvine.oeis.a072;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072420 This sequence lists the "toscodicity" of the integers, the minimum number of steps needed to transform the integer into 153 (which happens to be the sum of the cube of its digits, the sum of the first 17 integers and fishily "happens" to be the number of fish mentioned in John 21:10) by the TOSCOD (triple or sum cubes of digits) operator.
 * @author Sean A. Irvine
 */
public class A072420 extends Sequence1 {

  private static final Z Z153 = Z.valueOf(153);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Set<Z> s = new HashSet<>();
    s.add(mN);
    long cnt = 0;
    while (!s.contains(Z153)) {
      ++cnt;
      final Set<Z> t = new HashSet<>();
      for (final Z v : s) {
        t.add(v.multiply(3));
        t.add(Functions.DIGIT_SUM_CUBES.z(v));
      }
      s = t;
    }
    return Z.valueOf(cnt);
  }
}
