package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074807 Number of steps needed to reach a prime when the following map is repeatedly applied to n: if n is even then 2n + POD(n) + 1, otherwise 2n - POD(n) - 1, where POD(n) is the product of the digits of n; or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A074807 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    long cnt = 0;
    do {
      t = t.multiply2().signedAdd(t.isEven(), Functions.DIGIT_PRODUCT.z(t).add(1));
      if (!seen.add(t)) {
        return Z.NEG_ONE;
      }
      ++cnt;
    } while (!t.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
