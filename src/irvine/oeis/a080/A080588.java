package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A060010.
 * @author Sean A. Irvine
 */
public class A080588 extends PrependSequence {

  /** Construct the sequence. */
  public A080588() {
    super(0, new SimpleTransformSequence(new A080591(), Z.ONE::add), 0);
  }
}
