package irvine.oeis.a354;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A354223 allocated for Tamas Sandor Nagy.
 * @author Sean A. Irvine
 */
public class A354223 implements Sequence {

  private static final class Node {
    private final long mValue;
    private Node mNext;

    private Node(final long value, final Node next) {
      mValue = value;
      mNext = next;
    }
  }

  private Node mList = new Node(1, new Node(2, null));
  private long mLastUsed = 2;

  @Override
  public Z next() {
    final Node res = mList;
    mList = mList.mNext;
    final long skip = mList.mValue;
    Node l = mList;
    for (long k = 1; k < skip; ++k) {
      if (l.mNext == null) {
        l.mNext = new Node(++mLastUsed, null);
      }
      l = l.mNext;
    }
    res.mNext = l.mNext;
    l.mNext = res;
    return Z.valueOf(res.mValue);
  }
}
