package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A083936 A014486-encodings of trivalent plane trees (tpt) represented as (embedded into) a subset of general plane trees.
 * @author Sean A. Irvine
 */
public class A083936 extends A083930 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
