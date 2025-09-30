package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Conjectural;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080762 extends ComplementSequence implements Conjectural {

  // Conjectural because A080761 is conjectural

  /** Construct the sequence. */
  public A080762() {
    super(1, Z.ONE, new A080761());
  }
}
