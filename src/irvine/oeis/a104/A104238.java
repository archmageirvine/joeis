package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104238 Positive integers n such that n^5 + 1 is semiprime.
 * @author Georg Fischer
 */
public class A104238 extends Sequence1 {

  private int mN;
  private int mExpon;
  private HolonomicRecurrence mSeq1;
  private HolonomicRecurrence mSeq2;

  /** Construct the sequence. */
  public A104238() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param expon exponent of n
   */
  public A104238(final int expon) {
    mN = 0;
    mExpon = expon;
    final StringBuilder list1 = new StringBuilder("[[");
    final StringBuilder list2 = new StringBuilder("[");
    String sep = "[";
    if ((mExpon & 7) == 0) { // divisible by 8
      list1.append("1,0,0,0,0,0,0,0,1"); // 1+n^8
      for (int i = mExpon / 16; i >= 1; --i) {
        list2.append(sep);
        list2.append("1,0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0");
        sep = ",";
      }
    } else if ((mExpon & 3) == 0) { // divisible by 4
      list1.append("1,0,0,0,1"); // 1+n^4
      for (int i = mExpon / 8; i >= 1; --i) {
        list2.append(sep);
        list2.append("1,0,0,0,-1,0,0,0");
        sep = ",";
      }
    } else if ((mExpon & 1) == 0) { // divisible by 2
      list1.append("1,0,1"); // 1+n^2
      for (int i = mExpon / 4; i >= 1; --i) {
        list2.append(sep);
        list2.append("1,0,-1,0");
        sep = ",";
      }
    } else { // odd
      list1.append("1,1"); // 1+n
      for (int i = mExpon / 2; i >= 1; --i) {
        list2.append(sep);
        list2.append("1,-1");
        sep = ",";
      }
    }
    list1.append("],[-1]]");
    list2.append(",1],[-1]]");
    // System.out.println("make runholo OFF=1 MATRIX=\"" + list1 + "\" INIT=\"2\"");
    // System.out.println("make runholo OFF=1 MATRIX=\"" + list2 + "\" INIT=\"1\"");
    mSeq1 = new HolonomicRecurrence(1, list1.toString(), "2", 0);
    mSeq2 = new HolonomicRecurrence(1, list2.toString(), "1", 0);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p1 = mSeq1.next();
      final Z p2 = mSeq2.next(); // force next(), "&&" below is lazy
      if (p1.isProbablePrime() && p2.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
