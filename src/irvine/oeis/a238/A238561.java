package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238561 Number of partitions of 4^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238561 extends A258293 {

  /** Construct the sequence. */
  public A238561() {
    super(0, 0, Z.FOUR::pow);
  }
}
