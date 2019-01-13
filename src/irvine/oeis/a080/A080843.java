package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080843.
 * @author Sean A. Irvine
 */
public class A080843 implements Sequence {

  private final StringBuilder mSeq = new StringBuilder("01");
  private int mN = -1;
  private int mExpandPos = 0;


  @Override
  public Z next() {
    if (++mN >= mSeq.length()) {
      final char c = mSeq.charAt(++mExpandPos);
      switch (c) {
        case '0':
          mSeq.append("01");
          break;
        case '1':
          mSeq.append("02");
          break;
        default:
          mSeq.append('0');
          break;
      }
    }
    return Z.valueOf(mSeq.charAt(mN) - '0');
  }

}
