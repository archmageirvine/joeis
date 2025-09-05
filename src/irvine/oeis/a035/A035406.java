package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035406 Related to Rogers-Ramanujan Identities.
 * @author Sean A. Irvine
 */
public class A035406 extends Sequence1 {

  private long mM = 0;
  private final IntegerPartition mPart;

  protected A035406(final int residue) {
    mPart = new IntegerPartition(10000000 + residue);
  }

  /** Construct the sequence. */
  public A035406() {
    this(1);
  }

  private boolean is(final int[] p) {
    for (final int v : p) {
      final int r = v % 5;
      if (r != 2 && r != 3) {
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

