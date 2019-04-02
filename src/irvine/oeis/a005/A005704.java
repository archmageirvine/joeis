package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005704 Number of partitions of 3n into powers of 3.
 * @author Sean A. Irvine
 */
public class A005704 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : get(size() - 1).add(get(size() / 3));
  }

}
