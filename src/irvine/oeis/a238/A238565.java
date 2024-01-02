package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238565 Number of partitions of 8^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238565 extends A258293 {

  /** Construct the sequence. */
  public A238565() {
    super(0, 0, Z.EIGHT::pow);
  }
}
