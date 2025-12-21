package irvine.oeis.a082;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A082722 Numbers k for which there exist no palindromic 9-gonals (also known as nonagonals or enneagonals) of length k.
 * @author Sean A. Irvine
 */
public class A082722 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private final Sequence mS = new A082723();
  private int mPrevLength = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final int len = Functions.DIGIT_LENGTH.i(mS.next());
      for (int k = mPrevLength + 1; k < len; ++k) {
        mA.add(k);
      }
      mPrevLength = len;
    }
    return Z.valueOf(mA.pollFirst());
  }
}
