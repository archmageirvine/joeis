package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005705 Number of partitions of <code>4*n</code> into powers of 4.
 * @author Sean A. Irvine
 */
public class A005705 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : get(size() - 1).add(get(size() / 4));
  }

}
