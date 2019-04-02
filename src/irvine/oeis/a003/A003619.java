package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000149;

/**
 * A003619 Not of form [ e^m ], m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A003619 extends ComplementSequence {

  /** Construct the sequence. */
  public A003619() {
    super(new SkipSequence(new A000149(), 1), Z.ONE);
  }
}
