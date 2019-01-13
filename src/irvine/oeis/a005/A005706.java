package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005706.
 * @author Sean A. Irvine
 */
public class A005706 extends MemorySequence {

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : get(size() - 1).add(get(size() / 5));
  }

}
