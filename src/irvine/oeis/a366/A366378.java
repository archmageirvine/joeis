package irvine.oeis.a366;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a057.A057889;

/**
 * A366378 Numbers k such that A057889(k) == k (mod 3), where A057889 is the bijective bit-reverse.
 * @author Georg Fischer
 */
public class A366378 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A366378() {
    super(1, 0, new A057889(), (k, v) -> v.mod(3) == k % 3);
  }
}
