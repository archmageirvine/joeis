package irvine.oeis.a074;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;

/**
 * A074880 Number of labeled cyclic subgroups of S_n having order n.
 * @author Sean A. Irvine
 */
public class A074880 extends Combiner {

  /** Construct the sequence. */
  public A074880() {
    super(1, new A074351(), new A000010(), DIVIDE);
  }
}
