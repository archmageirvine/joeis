package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a096.A096419;
import irvine.math.partitions.IntegerPartition;

import java.util.ArrayList;


/**
 * A002722 Rotatable partitions.
 * @author Sean A. Irvine
 */
public class A002722 extends A096419 {

  // This currently is given different values for later terms
  // It could be an error in the original sequence?

  private final ArrayList<Z> mUnitPartitions = new ArrayList<>();
  {
    mUnitPartitions.add(null); // no 0 entry
  }
  private int mN = 0;

  @Override
  public Z next() {
    mUnitPartitions.add(super.next());
    Z s = Z.ZERO;
    int[] p;
    final IntegerPartition part = new IntegerPartition(++mN);
    while ((p = part.next()) != null) {
      Z t = Z.ONE;
      for (final int v : p) {
        t = t.multiply(mUnitPartitions.get(v));
      }
      s = s.add(t);
    }
    return s;
  }
}
