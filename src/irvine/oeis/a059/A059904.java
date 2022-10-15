package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059904 Periodic part of continued fraction for sqrt(n), encoded by recursively interleaving the bits in the binary expansions of the repeating terms.
 * @author Sean A. Irvine
 */
public class A059904 extends A059884 {

  private final Sequence mA = new A059903();

  @Override
  public Z next() {
    return encode(mA.next());
  }
}
