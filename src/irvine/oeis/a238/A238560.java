package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238560 Number of partitions of 3^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238560 extends A258293 {

  /** Construct the sequence. */
  public A238560() {
    super(0, 0, Z.THREE::pow);
  }
}
