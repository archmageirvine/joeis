package irvine.oeis.a004;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A004050 Numbers of the form 2^j + 3^k, for j and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A004050 extends Sequence1 {

  protected int mBase1; 
  protected int mBase2;
  private Z mPrev = null;

  private final TreeSet<Pair<Z, Z>> mPriority = new TreeSet<>((a, b) -> {
    int result = a.left().add(a.right()).compareTo(b.left().add(b.right()));
    if (result == 0) {
      result = a.left().compareTo(b.left());
      if (result == 0) {
        result = a.right().compareTo(b.right());
      }
    }
    return result;
  });
  
  /** Construct the sequence. */
  public A004050() {
    this(2, 3);
  }
  
  /**
   * Generic constructor with parameters
   * @param parm1 first base
   * @param parm2 second base
   */
  public A004050(final int parm1, final int parm2) {
    mBase1 = parm1;
    mBase2 = parm2;
    mPriority.add(new Pair<>(Z.ONE, Z.ONE));
    mPrev = Z.ZERO;
  }

  @Override
  public Z next() {
    Z res;
    do {
      final Pair<Z, Z> e = mPriority.pollFirst();
      mPriority.add(new Pair<>(e.left().multiply(mBase1), e.right()));
      mPriority.add(new Pair<>(e.left(), e.right().multiply(mBase2)));
/*
      if (false) {
        System.out.println("\npoll (" + e.left() + "," + e.right() + "), add ("
          + e.left().multiply(mBase1) + "," + e.right() + ") and ("
          + e.left() + "," + e.right().multiply(mBase2) + ")");
      } 
*/
      res = e.left().add(e.right());
    } while (res.equals(mPrev));
    mPrev = res;
    return res;
  }
}
