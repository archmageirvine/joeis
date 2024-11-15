package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073058 Define s(1)={1,2}, s(2)={1,3} and s(3)={1}. For a finite sequence A={a_1, ..., a_n}, with elements in {1,2,3}, define t(A) to be the concatenation of A, s(a_1), s(a_2), ... and s(a_n). Start with the sequence {1,2,3} and repeatedly apply t; limiting sequence is shown.
 * @author Sean A. Irvine
 */
public class A073058 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder("123");
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM == mA.length()) {
      final int len = mA.length();
      for (int k = 0; k < len; ++k) {
        mA.append('1');
        if (mA.charAt(k) == '1') {
          mA.append('2');
        } else if (mA.charAt(k) == '2') {
          mA.append('3');
        }
      }
    }
    return Z.valueOf(mA.charAt(mM) - '0');
  }
}
