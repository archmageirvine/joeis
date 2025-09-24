package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079000;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080591.
 * @author Sean A. Irvine
 */
public class A080589 extends PrependSequence {

  /** Construct the sequence. */
  public A080589() {
    super(0, new SimpleTransformSequence(new A079000(0, 1, 1, n -> n.mod(Z.FIVE).equals(Z.FOUR)), Z.ONE::add), 0);
  }
}
