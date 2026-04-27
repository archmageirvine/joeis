package irvine.oeis.a395;

import irvine.oeis.InverseSequence;
import irvine.oeis.a394.A394453;

/**
 * A395132 a(n) = smallest integer k &gt; 1 such that A394453(k) = n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A395132 extends InverseSequence {

  /** Construct the sequence. */
  public A395132() {
    super(1, 0, new A394453());
  }
}

