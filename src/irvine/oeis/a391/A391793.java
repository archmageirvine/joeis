package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A391793 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A391793 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A391793() {
    super(1, (p, e) -> Z.valueOf(((e % 5) * ((e % 5) - 5) + 4) / 2));
  }
}
