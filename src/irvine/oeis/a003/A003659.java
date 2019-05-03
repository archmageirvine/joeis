package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Stirling2TransformSequence;

/**
 * A003659 Shifts left under <code>Stirling-2</code> transform.
 * @author Sean A. Irvine
 */
public class A003659 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      add(Z.ONE);
      return Z.ONE;
    } else {
      return Stirling2TransformSequence.stirling2(this);
    }
  }
}
