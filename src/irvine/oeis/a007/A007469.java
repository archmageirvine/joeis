package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A007469 Shifts left 2 places under Stirling2 transform.
 * @author Sean A. Irvine
 */
public class A007469 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() <= 3) {
      if (size() == 0) {
        add(Z.ONE);
      }
      return Z.ONE;
    } else {
      return Stirling2TransformSequence.stirling2(toList(), size() - 2);
    }
  }
}
