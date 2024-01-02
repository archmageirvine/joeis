package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A238563 Number of partitions of 6^n into parts that are at most n.
 * @author Georg Fischer
 */
public class A238563 extends A258293 {

  /** Construct the sequence. */
  public A238563() {
    super(0, 0, Z.SIX::pow);
  }
}
