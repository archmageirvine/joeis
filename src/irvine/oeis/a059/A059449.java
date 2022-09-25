package irvine.oeis.a059;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a004.A004154;

/**
 * A059449 a(n)! begins with 2^n.
 * @author Sean A. Irvine
 */
public class A059449 extends A004154 {

  private static final int MAX_N = 100; // This is about saving memory
  private static final int MAX_LENGTH = Z.ONE.shiftLeft(MAX_N).toString().length();
  private final ArrayList<String> mF = new ArrayList<>();
  private int mN = -1;

  private String a(final int n) {
    while (n >= mF.size()) {
      final String s = super.next().toString();
      mF.add(s.substring(0, Math.min(s.length(), MAX_LENGTH)));
    }
    return mF.get(n);
  }

  @Override
  public Z next() {
    if (++mN >= MAX_N) {
      throw new UnsupportedOperationException("Increase MAX_N");
    }
    final Z a = Z.ONE.shiftLeft(mN);
    final String b = a.toString();
    int k = 0;
    while (true) {
      if (a(++k).startsWith(b)) {
        return Z.valueOf(k);
      }
    }
  }
}
