package irvine.oeis.a066;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A066156 a(n) is the least k&gt;n such that k*n = (product of digits of k) * (sum of digits of k), or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A066156 extends PrependSequence {

  /** Construct the sequence. */
  public A066156() {
    super(0, new A000004(), 10, 135, 15, 139968, 18, 756, 476, 0, 48);
  }
}
