package irvine.oeis.a019;

import java.util.HashMap;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001057;

/**
 * A019570 Zeroth row of infinite Latin square.
 * @author Sean A. Irvine
 */
public class A019570 implements Sequence {

  // The original algorithm is described in terms of two lists List I and List II,
  // starting with all the integers, and thereafter removing integers according to
  // a pair of processes.  Here instead we keep track of the items already removed
  // from the lists (the complements if you like), and generate the list on the fly
  // as required using A001057 (0, 1, -1, 2, -2, 3, -3, ...).

  private final HashSet<Long> mComplementList1 = new HashSet<>();
  private final HashSet<Long> mComplementList2 = new HashSet<>();
  //private final HashMap<Long, Long> mB = new HashMap<>();
  private final HashMap<Long, Long> mC = new HashMap<>();
  private long mN = -1;
  {
    //mB.put(0L, 0L);
    mC.put(0L, 0L);
    mComplementList1.add(0L);
    mComplementList2.add(0L);
  }

  private long getFirstMember(final A001057 list, final HashSet<Long> excluded) {
    long a;
    do {
      a = list.next().longValueExact();
    } while (excluded.contains(a));
    return a;
  }

  private void process1(final long k) {
    final A001057 seq = new A001057();
    final long a = getFirstMember(seq, mComplementList1);
    while (true) {
      final long aPrime = seq.next().intValueExact();
      if (aPrime == a || mComplementList1.contains(aPrime)) {
        continue;
      }
      final long t = mC.get(k) - aPrime;
      if (!mComplementList2.contains(t) && !mComplementList2.contains(t - a)) {
        //mB.put(k - 1, aPrime);
        //mB.put(k - 2, a);
        mC.put(k - 1, t);
        mC.put(k - 2, t - a);
        mComplementList1.add(a);
        mComplementList1.add(aPrime);
        mComplementList2.add(t);
        mComplementList2.add(t - 1);
        break;
      }
    }
  }

  private void process2(final long k) {
    final A001057 seq = new A001057();
    final long a = getFirstMember(seq, mComplementList2);
    while (true) {
      final long aPrime = seq.next().intValueExact();
      if (mComplementList1.contains(aPrime)) {
        continue;
      }
      final long t = mC.get(k) + aPrime;
      if (!mComplementList2.contains(t) && !mComplementList1.contains(a - t)) {
        mC.put(k + 1, t);
        mC.put(k + 2, a);
        //mB.put(k + 1, aPrime);
        //mB.put(k + 2, a);
        mComplementList1.add(aPrime);
        mComplementList1.add(a - t);
        mComplementList2.add(a);
        mComplementList2.add(t);
        break;
      }
    }
  }

  protected long side() {
    return 1;
  }

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      process1(-mN);
      process2(mN);
    }
    return Z.valueOf(mC.get(side() * mN));
  }
}
