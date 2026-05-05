package irvine.oeis.a084;

import irvine.oeis.Combiner;
import irvine.oeis.a080.A080107;

/**
 * A084708 Number of set partitions up to rotations and reflections.
 * @author Sean A. Irvine
 */
public class A084708 extends Combiner {

  /** Construct the sequence. */
  public A084708() {
    super(1, new A080107().skip(), new A084423().skip(), (a, b) -> a.add(b).divide2());
  }
}
