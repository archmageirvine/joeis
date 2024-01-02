package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238566 Number of partitions of 9^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238566 extends A258293 {

  /** Construct the sequence. */
  public A238566() {
    super(0, 0, Z.NINE::pow);
  }
}
