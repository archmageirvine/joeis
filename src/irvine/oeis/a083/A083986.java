package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a101.A101594;

/**
 * A083986 If k is a number with exactly two distinct decimal digits, say a and b, neither of which is 0 (i.e., a member of A101594), define the self-complement of k, SC(k), to be the number obtained by replacing a with b and vice versa. Then a(n) = lcm(A101594(n), SC(A101594(n))).
 * @author Sean A. Irvine
 */
public class A083986 extends A101594 {

  @Override
  public Z next() {
    final Z t = super.next();
    final String s = t.toString();
    final char c = s.charAt(0);
    final char d;
    for (int k = 1; true; ++k) {
      if (s.charAt(k) != c) {
        d = s.charAt(k);
        break;
      }
    }
    final Z u = new Z(s.replace(c, 'X').replace(d, c).replace('X', d));
    return Functions.LCM.z(t, u);
  }
}
