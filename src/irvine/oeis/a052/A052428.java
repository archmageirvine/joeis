package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a051.A051882;

/**
 * A052428 Strict Egyptian numbers (complement of A051882).
 * @author Sean A. Irvine
 */
public class A052428 extends ComplementSequence {

  /** Construct the sequence. */
  public A052428() {
    super(new A051882(), Z.ONE);
  }
}
