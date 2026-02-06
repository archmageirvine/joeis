package irvine.oeis.a390;

import irvine.oeis.InverseSequence;
import irvine.oeis.a392.A392758;

/**
 * A390927 a(n) is the smallest integer k for which A392758(k) is equal to n.
 * @author Sean A. Irvine
 */
public class A390927 extends InverseSequence {

  /** Construct the sequence. */
  public A390927() {
    super(0, 0, new A392758());
  }
}
