package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002858 Ulam numbers: a(1) = 1; a(2) = 2; for n&gt;2, a(n) = least number &gt; a(n-1) which is a unique sum of two distinct earlier terms.
 * @author Sean A. Irvine
 */
public class A002858 extends AbstractSequence {

  /* Construct the sequence. */
  public A002858() {
    super(1);
  }

  // Ulam numbers
  protected final ArrayList<Z> mSeq = new ArrayList<>();
  private final TreeSet<Z> mSums = new TreeSet<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();

  protected Z a1() {
    return Z.ONE;
  }

  protected Z a2() {
    return Z.TWO;
  }

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      final Z a1 = a1();
      mSeq.add(a1);
      return a1;
    }
    if (mSeq.size() == 1) {
      final Z a2 = a2();
      mSeq.add(a2);
      mSums.add(a2.add(a1()));
      return a2;
    }
    final Z prev = mSeq.get(mSeq.size() - 1);
    while (true) {
      final Z next = mSums.pollFirst();
      if (next.compareTo(prev) <= 0 || mNotUnique.contains(next)) {
        mNotUnique.remove(next);
        continue;
      }
      for (final Z v : mSeq) {
        final Z s = v.add(next);
        if (!mSums.add(s)) {
          mNotUnique.add(s);
        }
      }
      mSeq.add(next);
      return next;
    }
  }
}
