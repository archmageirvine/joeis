package irvine.oeis.a036;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036038.
 * @author Sean A. Irvine
 */
public class A036038 implements Sequence {

  private final TreeSet<int[]> mA = new TreeSet<>((a, b) -> {
    final int c = Integer.compare(a.length, b.length);
    if (c != 0) {
      return c;
    }
    for (int k = 0; k < a.length; ++k) {
      final int ck = Integer.compare(b[k], a[k]);
      if (ck != 0) {
        return ck;
      }
    }
    return 0;
  });
  private int mN = 0;


  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final IntegerPartition part = new IntegerPartition(++mN);
      int[] p;
      while ((p = part.next()) != null) {
        mA.add(Arrays.copyOf(p, p.length));
      }
    }
    return Binomial.multinomial(mN, mA.pollFirst());
  }
}

