package irvine.oeis.a335;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import irvine.math.group.LinearGroupOrder;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a246.A246655;

/**
 * A335000 Orders of the groups PSL(m,q) in increasing order as q runs through the prime powers (with repetitions).
 * @author Gregory Morse
 */
public class A335000 extends Sequence1 {

  private static final class Entry implements Comparable<Entry> {
    private final int mDegree;
    private final int mIndex;
    private final Z mBound;

    private Entry(final int degree, final int index, final Z bound) {
      mDegree = degree;
      mIndex = index;
      mBound = bound;
    }

    @Override
    public int compareTo(final Entry other) {
      return mBound.compareTo(other.mBound);
    }
  }

  private final A246655 mPrimePowers = new A246655();
  private final List<Z> mFields = new ArrayList<>();
  private final PriorityQueue<Entry> mPending = new PriorityQueue<>();
  private final PriorityQueue<Z> mOrders = new PriorityQueue<>();
  private final boolean mGeneral;

  /**
   * Construct the sequence.
   * @param general use GL instead of PSL
   */
  protected A335000(final boolean general) {
    mGeneral = general;
    add(2, 0);
  }

  /** Construct the sequence. */
  public A335000() {
    this(false);
  }

  private void add(final int degree, final int index) {
    while (mFields.size() <= index) {
      mFields.add(mPrimePowers.next());
    }
    final Z q = mFields.get(index);
    final Z g = LinearGroupOrder.general(degree, q);
    // SL/degree is a monotone lower bound even when gcd(degree,q-1) jumps.
    mPending.add(new Entry(degree, index, mGeneral ? g : g.divide(q.subtract(1).multiply(degree))));
  }

  protected boolean accept(final int degree, final Z q) {
    return true;
  }

  @Override
  public Z next() {
    while (mOrders.isEmpty() || mPending.peek().mBound.compareTo(mOrders.peek()) <= 0) {
      final Entry entry = mPending.remove();
      final Z q = mFields.get(entry.mIndex);
      if (accept(entry.mDegree, q)) {
        mOrders.add(mGeneral ? entry.mBound : LinearGroupOrder.projectiveSpecial(entry.mDegree, q));
      }
      add(entry.mDegree, entry.mIndex + 1);
      if (entry.mIndex == 0) {
        add(entry.mDegree + 1, 0);
      }
    }
    return mOrders.remove();
  }
}
