package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238562 Number of partitions of 5^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238562 extends A258293 {

  /** Construct the sequence. */
  public A238562() {
    super(0, 0, Z.FIVE::pow);
  }
}
