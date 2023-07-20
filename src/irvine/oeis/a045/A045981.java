package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A045981 Describe all the previous terms!.
 * @author Sean A. Irvine
 */
public class A045981 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    for (final Z v : this) {
      sb.append(A045918.lookAndSay(v.toString()));
    }
    return new Z(sb);
  }
}
