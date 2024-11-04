package irvine.oeis.a072;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072893 Let c(k) be defined as follows: c(1)=1, c(2)=x, c(k+2) = c(k+1)/2 + c(k)/2 if c(k+1) and c(k) have the same parity; c(k+2) = c(k+1) - c(k) otherwise. Sequence gives values of x such that c(k)=1 for any k large enough.
 * @author Sean A. Irvine
 */
public class A072893 extends Sequence1 {

  private static final Z NEG_TWO = Z.valueOf(-2);
  private static final Z NEG_THREE = Z.valueOf(-3);
  private static final Z[] C1 = {Z.ZERO, Z.NEG_ONE, Z.ONE, Z.ZERO, Z.ONE, Z.NEG_ONE};
  private long mN = 0;

  private boolean is(final long n) {
    if (n == 2) {
      return true;
    }
    final Z[] c = {Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, Z.valueOf(n)};
    while (true) {
      if (Arrays.equals(c, C1)) {
        return false;
      }
      final Z v = c[c.length - 1];
      final Z u = c[c.length - 2];
      if (v.equals(Z.ONE) && u.equals(Z.ONE)) {
        return true;
      }
      if (v.equals(Z.NEG_ONE) && u.equals(Z.NEG_ONE)) {
        return false;
      }
      if (v.equals(Z.NEG_ONE) && u.equals(Z.TWO) && c[c.length - 3].equals(Z.ONE) && c[c.length - 4].equals(Z.THREE)) {
        return false;
      }
      if (v.equals(Z.ONE) && u.equals(NEG_TWO) && c[c.length - 3].equals(Z.NEG_ONE) && c[c.length - 4].equals(NEG_THREE)) {
        return false;
      }
      // c(k+2) = c(k+1)/2 + c(k)/2 if c(k+1) and c(k) have the same parity; c(k+2) = c(k+1) - c(k) otherwise
      System.arraycopy(c, 1, c, 0, c.length - 1);
      if (u.testBit(0) == v.testBit(0)) {
        c[c.length - 1] = v.add(u).divide2();
      } else {
        //c[c.length - 1] = v.subtract(u); // This appears to be wrong
        c[c.length - 1] = u.subtract(v);
      }
      //System.out.println(n + " " + Arrays.toString(c));
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

