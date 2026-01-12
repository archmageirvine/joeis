package irvine.oeis.a083;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A083122 a(1) = 1, then the smallest number not included earlier and not a string of 1's such that the concatenation a(n), a(n+1) is a palindrome.
 * @author Sean A. Irvine
 */
public class A083122 extends PrependSequence {

  /** Construct the sequence. */
  public A083122() {
    super(1, new Sequence1() {
      private final LinkedList<Z> mA = new LinkedList<>();
      private int mK = 1;
      @Override
      public Z next() {
        if (mA.isEmpty()) {
          ++mK;
          final String ones = "1".repeat(mK);
          mA.add(new Z(2 + ones));
          mA.add(new Z(ones + 2));
          mA.add(new Z("12" + ones));
          mA.add(new Z(ones + "121"));
        }
        return mA.pollFirst();
      }
    }, 1, 21, 2, 12, 121, 1121);
  }
}

