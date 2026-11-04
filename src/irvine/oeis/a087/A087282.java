package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087282 An infinite audioactive word, one of three in the cycle that results from the limit of the 'Look and Say' sequence using method A with an initial term of 1 (A005150).
 * @author Sean A. Irvine
 */
public class A087282 extends Sequence1 {

  private String mA = "11131";
  private String mB = "";
  private String mC = "";
  private int mN = -1;

  protected Z select(final int n, final String a, final String b, final String c) {
    return Z.valueOf(a.charAt(n) - '0');
  }

  private String transform(final String s) {
    // Need to be careful to allow for further occurrences of whatever character ends s
    int pos = s.length() - 1;
    final char c = s.charAt(pos);
    while (s.charAt(--pos) == c) {
      // do nothing
    }
    return Functions.LOOK_AND_SAY.z(new Z(s.substring(0, pos + 1))).toString();
  }

  @Override
  public Z next() {
    ++mN;
    while (mC.length() <= mN || mB.length() <= mN) {
      mB = transform(mA);
      mC = transform(mB);
      mA = transform(mC);
    }
    return select(mN, mA, mB, mC);
  }
}

