package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A005706 Number of partitions of 5n into powers of 5.
 * @author Sean A. Irvine
 */
public class A005706 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : a(size() - 1).add(a(size() / 5));
  }

}
