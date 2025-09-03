package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035401 Related to Rogers-Ramanujan Identities.
 * @author Sean A. Irvine
 */
public class A035401 extends Sequence1 {

  private int mM = 0;
  private final IntegerPartition mPart;

  protected A035401(final int residue) {
    mPart = new IntegerPartition(10000000 + residue);
  }

  /** Construct the sequence. */
  public A035401() {
    this(1);
  }

  private boolean is(final int[] p) {
    for (final int v : p) {
      final int r = v % 5;
      if (r != 1 && r != 4) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      if (is(mPart.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}

