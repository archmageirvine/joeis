package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005705 Number of partitions of 4*n into powers of 4.
 * @author Sean A. Irvine
 */
public class A005705 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : a(size() - 1).add(a(size() / 4));
  }

}
