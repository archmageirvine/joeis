package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A051774 Contracted numbers.
 * @author Sean A. Irvine
 */
public class A051774 extends ComplementSequence {

  /** Construct the sequence. */
  public A051774() {
    super(new A051772(), Z.ONE);
  }
}
