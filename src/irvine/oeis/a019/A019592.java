package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019592.
 * @author Sean A. Irvine
 */
public class A019592 implements Sequence {

  // todo this is kind of interesting but doesn't reproduce expected sequence.

  private static final class Node {
    Node mNext;
    final boolean mOriginal;

    private Node(final boolean original) {
      mOriginal = original;
    }
  }

  private int mN = 0;

  private Node makeCircle(final int n) {
    final Node first = new Node(true);
    Node prev = first;
    for (int k = 1; k < n; ++k) {
      final Node t = new Node(true);
      prev.mNext = t;
      prev = t;
    }
    prev.mNext = first;
    return first;
  }

  @Override
  public Z next() {
    Node circle = makeCircle(++mN);
    int remaining = mN;
    long count = 0;
    while (remaining > 0) {
      circle = circle.mNext.mNext.mNext;
      // Are we splitting two of the original points
      if (circle.mOriginal && circle.mNext.mOriginal) {
        --remaining;
      }
      // Insert a new node
      final Node next = new Node(false);
      next.mNext = circle.mNext;
      circle.mNext = next;
      circle = next;
      ++count;
    }
    return Z.valueOf(count);
  }

}
