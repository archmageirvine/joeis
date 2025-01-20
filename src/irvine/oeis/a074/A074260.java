package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000793;

/**
 * A074260 Number of labeled cyclic subgroups of S_n having the maximum possible order.
 * @author Sean A. Irvine
 */
public class A074260 extends Combiner {

  /** Construct the sequence. */
  public A074260() {
    super(0, new A074859(), new A000793(), (a, b) -> a.divide(Functions.PHI.z(b)));
  }
}
