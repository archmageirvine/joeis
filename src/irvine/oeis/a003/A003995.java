package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003995 Sum of (any number of) distinct squares: of form r^2 + s^2 + t^2 <code>+ </code>... with <code>0 &lt;=</code> r &lt; s &lt; t <code>&lt; </code>...
 * @author Sean A. Irvine
 */
public class A003995 implements Sequence {

  private static final long[] SEQ = {
    0, 1, 4, 5, 9, 10, 13, 14, 16, 17, 20, 21, 25, 26, 29, 30, 34, 35, 36, 37, 38, 39, 40, 41, 42, 45, 46, 49, 50,
    51, 52, 53, 54, 55, 56, 57, 58, 59, 61, 62, 63, 64, 65, 66, 68, 69, 70, 71, 73, 74, 75, 77, 78, 79, 80, 81,
    82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 93, 94, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 109,
    110, 111, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127
  };
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN < SEQ.length ? SEQ[(int) mN] : mN + 31);
  }
}
