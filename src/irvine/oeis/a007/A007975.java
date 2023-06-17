package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007975 Number of permutations that are 3 "block reversals" away from 12...n.
 * @author Sean A. Irvine
 */
public class A007975 extends AbstractSequence {

  /** Construct the sequence. */
  public A007975() {
    super(4);
  }

  protected int mN = start();
  private final HashSet<String> mSeen = new HashSet<>();
  protected HashSet<String> mPrev = new HashSet<>();

  // Perform block reversals on all those at the current distance, disregarding
  // any permutations that have already been achieved.
  protected void step() {
    final HashSet<String> next = new HashSet<>();
    for (final String perm : mPrev) {
      final char[] p = perm.toCharArray();
      for (int start = 0; start < p.length; ++start) {
        for (int length = 2; length <= p.length - start; ++length) {
          A007972.reverse(p, start, length);
          final String key = new String(p);
          if (mSeen.add(key)) {
            next.add(key);
          }
          A007972.reverse(p, start, length); // undo
        }
      }
    }
    mPrev = next;
  }

  protected int start() {
    return 3;
  }

  protected void init() {
    final char[] p = new char[++mN];
    for (int k = 0; k < p.length; ++k) {
      p[k] = (char) k;
    }
    mSeen.clear();
    mPrev.clear();
    mSeen.add(new String(p));
    mPrev.add(new String(p));
  }

  @Override
  public Z next() {
    init();
    step(); // 1
    step(); // 2
    step(); // 3
    return Z.valueOf(mPrev.size());
  }
}
