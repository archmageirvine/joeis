package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080588 a(n) is the smallest nonnegative integer which is consistent with sequence being monotonically increasing and satisfying a(a(n)) = 4n.
 * @author Sean A. Irvine
 */
public class A080588 extends PrependSequence {

  /** Construct the sequence. */
  public A080588() {
    super(0, new SimpleTransformSequence(new A080591(), Z.ONE::add), 0);
  }
}
