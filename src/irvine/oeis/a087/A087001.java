
package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a086.A086999;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A087001 Left half of periodic part of decimal expansion of 1/p for those primes having a periodic part of even length.
 * @author Sean A. Irvine
 */
public class A087001 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A087001() {
    super(1, new A086999(), p -> {
      final String s = p.toString();
      return new Z(s.substring(0, s.length() / 2));
    });
  }
}
