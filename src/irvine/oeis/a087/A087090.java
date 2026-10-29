package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A056412.
 * @author Sean A. Irvine
 */
public class A087090 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087090() {
    super(1, 0, k -> {
      final Z t = Z.valueOf(k).square().add(k + 41);
      return t.isProbablePrime() && t.add(2).isProbablePrime();
    });
  }
}
