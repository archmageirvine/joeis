package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238564 Number of partitions of 7^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238564 extends A258293 {

  /** Construct the sequence. */
  public A238564() {
    super(0, 0, Z.SEVEN::pow);
  }
}
